package ru.service;

public class Message {
    String chatName;
    String text;
    String date;
    String time;

    protected Message(String chatName, String text, String date, String time) { //конструктор
        this.chatName = chatName;
        this.text = text;
        this.date = date;
        this.time = time;
    }
}
