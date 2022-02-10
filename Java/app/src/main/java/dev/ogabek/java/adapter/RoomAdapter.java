package dev.ogabek.java.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.imageview.ShapeableImageView;

import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.model.Room;

public class RoomAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_CREATE_ROOM_VIEW = 0;
    private static final int TYPE_SIMPLE_ROOM_VIEW = 1;

    private final List<Room> rooms;

    public RoomAdapter(List<Room> rooms) {
        this.rooms = rooms;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_CREATE_ROOM_VIEW;
        } else {
            return  TYPE_SIMPLE_ROOM_VIEW;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_CREATE_ROOM_VIEW) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_create_room_view, parent, false);
            return new CreateRoomViewHolder(view);
        }
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_room_view, parent, false);
        return new RoomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Room room = rooms.get(position);

        if (holder instanceof RoomViewHolder) {
            ((RoomViewHolder) holder).profile.setImageResource(room.getProfile());
            ((RoomViewHolder) holder).fullName.setText(room.getFullName());
        }

        if (holder instanceof CreateRoomViewHolder) {

        }
    }

    @Override
    public int getItemCount() {
        return rooms.size();
    }

    private static class RoomViewHolder extends RecyclerView.ViewHolder {

        ShapeableImageView profile;
        TextView fullName;

        public RoomViewHolder(View view) {
            super(view);

            profile = view.findViewById(R.id.iv_profile);
            fullName = view.findViewById(R.id.tv_full_name);

        }
    }

    private static class CreateRoomViewHolder extends RecyclerView.ViewHolder {
        public CreateRoomViewHolder(View view) {
            super(view);
        }
    }
}
