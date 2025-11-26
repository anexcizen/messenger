package ru.user;

public class UserChat {
    private String name;
    private String info;

    public UserChat(User person) {
        name = person.getUserName();
        info = person.getLastSeen();
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }
}
