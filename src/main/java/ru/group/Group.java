package ru.group;

public class Group {
    private String groupName;
    private int countOfUsers;
    private String[] members;
//добавление геттеров
    public String getGroupName() {
        return groupName;
    }

    public int getCountOfUsers() {
        return countOfUsers;
    }

    public String[] getMembers() {
        return members;
    }

    public Group(String groupName, int countOfUsers, String[] members) {
        this.groupName = groupName;
        countOfUsers = members.length;
        this.members = members;
    }
}

