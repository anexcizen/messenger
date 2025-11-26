package ru.user;

public class UserChat {
    String name;
    String info;
    public UserChat(User person) {
        name = person.userName;
        info = person.lastSeen;
    }
}
