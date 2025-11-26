package ru.user;

public class UserChat {
    private String name;
    private String info;

    public UserChat(User person) {
        name = person.userName;
        info = person.lastSeen;
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
