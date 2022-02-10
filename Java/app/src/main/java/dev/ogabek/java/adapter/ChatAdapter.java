package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Chat;
import dev.ogabek.java.model.Message;
import dev.ogabek.java.model.Room;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final int TYPE_ITEM_ROOM = 0;
    private final int TYPE_ITEM_MESSAGE = 1;

    private Context context;
    private List<Chat> chats;

    public ChatAdapter(Context context, List<Chat> chats) {
        this.context = context;
        this.chats = chats;
    }

    @Override
    public int getItemViewType(int position) {
        Chat feed  = chats.get(position);
        if (feed.getRooms().size() > 0)
            return TYPE_ITEM_ROOM;
        return TYPE_ITEM_MESSAGE;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM_ROOM) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_room, parent, false);
            return new RoomViewHolder(context, view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_chat_message, parent, false);
        return new MessageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Chat message = chats.get(position);

        if (holder instanceof RoomViewHolder) {
            refreshAdapter(((RoomViewHolder) holder).recyclerView, message.getRooms());
        }
        if (holder instanceof MessageViewHolder) {
            ((MessageViewHolder) holder).profile.setImageResource(message.getMessage().getProfile());
            ((MessageViewHolder) holder).fullName.setText(message.getMessage().getFullName());
            if (message.getMessage().isOnline()) {
                ((MessageViewHolder) holder).isOnline.setVisibility(View.VISIBLE);
            } else {
                ((MessageViewHolder) holder).isOnline.setVisibility(View.GONE);
            }
        }
    }

    private void refreshAdapter(RecyclerView recyclerView, ArrayList<Room> rooms) {
        RoomAdapter adapter = new RoomAdapter(rooms);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public int getItemCount() {
        return chats.size();
    }

    private static class RoomViewHolder extends RecyclerView.ViewHolder {

        RecyclerView recyclerView;

        public RoomViewHolder(Context context, View view) {
            super(view);

            recyclerView = view.findViewById(R.id.rv_chat_room);

            LinearLayoutManager manager = new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(manager);

        }
    }

    private static class MessageViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profile;
        TextView fullName;
        LinearLayout isOnline;

        public MessageViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_profile);
            fullName = view.findViewById(R.id.tv_full_name);
            isOnline = view.findViewById(R.id.is_online);

        }
    }
}
