package dev.ogabek.java.model;

public class Message {

    private final int profile;
    private final String fullName;
    private boolean isOnline = false;

    public Message(int profile, String fullName, boolean isOnline) {
        this.profile = profile;
        this.fullName = fullName;
        this.isOnline = isOnline;
    }

    public Message(int profile, String fullName) {
        this.profile = profile;
        this.fullName = fullName;
    }

    public int getProfile() {
        return profile;
    }

    public String getFullName() {
        return fullName;
    }

    public boolean isOnline() {
        return isOnline;
    }

}
