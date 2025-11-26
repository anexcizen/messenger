package ru.channel;
import ru.service.Message;

public class ChannelChat {
    private String name;
    private int subscribers;

    public String getName() {
        return name;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public ChannelChat(String name, int subscribers) {
        this.name = name;
        this.subscribers = subscribers;
    }
}
