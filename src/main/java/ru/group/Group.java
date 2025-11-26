package ru.group;

public class Group {
    private String groupName;
    private int countOfUsers;
    private String[] members;
    //добавление геттера
    public String getGroupName() {
        return groupName;
    }
    // добавление геттера
    public int getCountOfUsers() {
        return countOfUsers;
    }

    public String getMembers() {
        String membersString = "";
        for (String x : members) {
            membersString += x + " ";
        }
        return membersString;
    }

    public Group(String groupName, int countOfUsers, String[] members) {
        this.groupName = groupName;
        this.countOfUsers = members.length;
        this.members = members;
    }
}

