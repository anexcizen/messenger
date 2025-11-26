package ru.group;

public class Group {
    private String groupName;
    private int countOfUsers;
    private String[] members;

    public Group(String groupName, int countOfUsers, String[] members) {
        this.groupName = groupName;
        countOfUsers = members.length;
        this.members = members;
    }
}

