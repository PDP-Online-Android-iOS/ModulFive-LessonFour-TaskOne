package dev.ogabek.java.model;

import java.util.ArrayList;

public class Chat {

    Message message;
    ArrayList<Room> rooms = new ArrayList<>();

    public Chat(Message message) {
        this.message = message;
    }

    public Chat(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public Message getMessage() {
        return message;
    }
}
