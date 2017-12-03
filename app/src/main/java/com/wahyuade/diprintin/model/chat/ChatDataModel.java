package com.wahyuade.diprintin.model.chat;

/**
 * Created by wahyu on 10/9/2017.
 */

public class ChatDataModel {
    private String id_room;
    private String id_client;
    private String chat;
    private String time;

    public String getId_room() {
        return id_room;
    }

    public String getId_client() {
        return id_client;
    }

    public String getChat() {
        return chat;
    }

    public String getTime() {
        return time;
    }

    public ChatDataModel(String id_room, String id_client, String chat, String time) {
        this.id_room = id_room;
        this.id_client = id_client;
        this.chat = chat;
        this.time = time;
    }
}
