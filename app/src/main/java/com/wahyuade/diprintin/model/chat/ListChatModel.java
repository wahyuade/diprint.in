package com.wahyuade.diprintin.model.chat;

/**
 * Created by wahyu on 10/8/2017.
 */

public class ListChatModel {
    private String id, id_user, nama, last_chat, waktu, foto;

    public String getId_user() {
        return id_user;
    }

    public String getNama() {
        return nama;
    }

    public String getLast_chat() {
        return last_chat;
    }

    public String getWaktu() {
        return waktu;
    }

    public String getFoto() {
        return foto;
    }

    public ListChatModel(String id, String id_user, String nama, String last_chat, String waktu, String foto) {
        this.id = id;
        this.id_user = id_user;
        this.nama = nama;
        this.last_chat = last_chat;
        this.waktu = waktu;
        this.foto = foto;
    }

    public ListChatModel(String id_user, String nama, String last_chat, String waktu, String foto) {
        this.id_user = id_user;
        this.nama = nama;
        this.last_chat = last_chat;
        this.waktu = waktu;
        this.foto = foto;
    }

    public String getId() {
        return id;
    }
}
