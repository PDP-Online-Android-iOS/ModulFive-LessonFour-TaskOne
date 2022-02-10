package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.ChatAdapter;
import dev.ogabek.java.model.Chat;
import dev.ogabek.java.model.Message;
import dev.ogabek.java.model.Room;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));

        refreshAdapter(getAllChats());

    }

    private void refreshAdapter(List<Chat> chats) {
        ChatAdapter adapter = new ChatAdapter(this, getAllChats());
        recyclerView.setAdapter(adapter);
    }

    private ArrayList<Chat> getAllChats() {
        ArrayList<Room> stories = new ArrayList<>();
        stories.add(new Room(R.drawable.aziz, "Azizbek"));
        stories.add(new Room(R.drawable.bogibek, "Bogibek Matyaqubov"));
        stories.add(new Room(R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Room(R.drawable.jabbor, "Jabbor"));
        stories.add(new Room(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Room(R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Room(R.drawable.yahyo, "Yahyo Mahmudiy"));
        stories.add(new Room(R.drawable.aziz, "Azizbek"));
        stories.add(new Room(R.drawable.bogibek, "Bogibek Matyaqubov"));
        stories.add(new Room(R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Room(R.drawable.jabbor, "Jabbor"));
        stories.add(new Room(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Room(R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Room(R.drawable.yahyo, "Yahyo Mahmudiy"));
        stories.add(new Room(R.drawable.aziz, "Azizbek"));
        stories.add(new Room(R.drawable.bogibek, "Bogibek Matyaqubov"));
        stories.add(new Room(R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Room(R.drawable.jabbor, "Jabbor"));
        stories.add(new Room(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Room(R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Room(R.drawable.yahyo, "Yahyo Mahmudiy"));
        stories.add(new Room(R.drawable.aziz, "Azizbek"));
        stories.add(new Room(R.drawable.bogibek, "Bogibek Matyaqubov"));
        stories.add(new Room(R.drawable.elmurod, "Elmurod Nazirov"));
        stories.add(new Room(R.drawable.jabbor, "Jabbor"));
        stories.add(new Room(R.drawable.ogabekdev, "Ogabek Matyakubov"));
        stories.add(new Room(R.drawable.shakhriyor, "Shakhriyor"));
        stories.add(new Room(R.drawable.yahyo, "Yahyo Mahmudiy"));

        ArrayList<Chat> chats = new ArrayList<>();
        chats.add(new Chat(stories));
        chats.add(new Chat(new Message(R.drawable.aziz, "Azizbek")));
        chats.add(new Chat(new Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)));
        chats.add(new Chat(new Message(R.drawable.elmurod, "Elmurod Nazirov", true)));
        chats.add(new Chat(new Message(R.drawable.jabbor, "Jabbor")));
        chats.add(new Chat(new Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)));
        chats.add(new Chat(new Message(R.drawable.shakhriyor, "Shakhriyor")));
        chats.add(new Chat(new Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)));
        chats.add(new Chat(new Message(R.drawable.aziz, "Azizbek")));
        chats.add(new Chat(new Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)));
        chats.add(new Chat(new Message(R.drawable.elmurod, "Elmurod Nazirov", true)));
        chats.add(new Chat(new Message(R.drawable.jabbor, "Jabbor")));
        chats.add(new Chat(new Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)));
        chats.add(new Chat(new Message(R.drawable.shakhriyor, "Shakhriyor")));
        chats.add(new Chat(new Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)));
        chats.add(new Chat(new Message(R.drawable.aziz, "Azizbek")));
        chats.add(new Chat(new Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)));
        chats.add(new Chat(new Message(R.drawable.elmurod, "Elmurod Nazirov", true)));
        chats.add(new Chat(new Message(R.drawable.jabbor, "Jabbor")));
        chats.add(new Chat(new Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)));
        chats.add(new Chat(new Message(R.drawable.shakhriyor, "Shakhriyor")));
        chats.add(new Chat(new Message(R.drawable.yahyo, "Yahyo Mahmudiy", true)));
        chats.add(new Chat(new Message(R.drawable.aziz, "Azizbek")));
        chats.add(new Chat(new Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)));
        chats.add(new Chat(new Message(R.drawable.elmurod, "Elmurod Nazirov", true)));
        chats.add(new Chat(new Message(R.drawable.jabbor, "Jabbor")));
        chats.add(new Chat(new Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)));
        chats.add(new Chat(new Message(R.drawable.shakhriyor, "Shakhriyor")));
        chats.add(new Chat(new Message(R.drawable.yahyo, "Yahyo Mdiy", true)));
        chats.add(new Chat(new Message(R.drawable.aziz, "Azizbek")));
        chats.add(new Chat(new Message(R.drawable.bogibek, "Bogibek Matyaqubov", true)));
        chats.add(new Chat(new Message(R.drawable.elmurod, "Elmurod Nazirov", true)));
        chats.add(new Chat(new Message(R.drawable.jabbor, "Jabbor")));
        chats.add(new Chat(new Message(R.drawable.ogabekdev, "Ogabek Matyakubov", true)));
        chats.add(new Chat(new Message(R.drawable.shakhriyor, "Shakhriyor")));
        chats.add(new Chat(new Message(R.drawable.yahyo, "Yahyo Mnew ahmudiy", true)));

        return chats;
    }
}