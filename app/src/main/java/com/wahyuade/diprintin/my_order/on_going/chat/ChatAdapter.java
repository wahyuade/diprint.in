package com.wahyuade.diprintin.my_order.on_going.chat;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.wahyuade.diprintin.R;
import com.wahyuade.diprintin.model.chat.ChatDataModel;

import java.util.ArrayList;

import me.himanshusoni.chatmessageview.ChatMessageView;

/**
 * Created by wahyu on 10/9/2017.
 */

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatList> {

    private Activity activity;
    private ArrayList<ChatDataModel> data_chat;

    public ChatAdapter(Activity activity, ArrayList<ChatDataModel> data_chat) {
        this.activity = activity;
        this.data_chat = data_chat;
    }

    @Override
    public ChatList onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == 1){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_chat_content_mine, parent, false);
            return new ChatList(v);
        }else{
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_chat_content_other, parent, false);
            return new ChatList(v);
        }
    }

    @Override
    public int getItemViewType(int position) {
        if(true){
            return 1;
        }else{
            return 0;
        }
    }

    @Override
    public void onBindViewHolder(ChatList holder, int position) {
        holder.content_chat.setText(data_chat.get(position).getChat());
        holder.waktu.setText(data_chat.get(position).getTime());
    }

    @Override
    public int getItemCount() {
        return data_chat.size();
    }

    public class ChatList extends RecyclerView.ViewHolder {
        private ChatMessageView bundle_chat;
        private TextView content_chat, waktu;
        public ChatList(View itemView) {
            super(itemView);
            bundle_chat = (ChatMessageView)itemView.findViewById(R.id.bundle_chat);
            content_chat = (TextView)itemView.findViewById(R.id.content_chat);
            waktu = (TextView)itemView.findViewById(R.id.waktu);
        }
    }
}
