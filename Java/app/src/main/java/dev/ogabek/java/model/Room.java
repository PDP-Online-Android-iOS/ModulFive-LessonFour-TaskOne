package dev.ogabek.java.model;

public class Room {

    private final int profile;
    private final String fullName;

    public Room(int profile, String fullName) {
        this.profile = profile;
        this.fullName = fullName;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }
}
