package com.wahyuade.diprintin.my_order.on_going.chat;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.wahyuade.diprintin.R;
import com.wahyuade.diprintin.model.chat.ChatDataModel;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ChatActivity extends AppCompatActivity {
    private ChatAdapter adapter;
    private RecyclerView list_chat_data;
    private TextInputEditText message;
    private FloatingActionButton kirim;

    private ArrayList<ChatDataModel> chat_data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Teather Print");

        list_chat_data = (RecyclerView)findViewById(R.id.list_chat_data);
        message = (TextInputEditText)findViewById(R.id.message);
        kirim = (FloatingActionButton)findViewById(R.id.kirim);
        list_chat_data.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        chat_data = new ArrayList<>();
        adapter = new ChatAdapter(this, chat_data);
        list_chat_data.setAdapter(adapter);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date date = new Date();
                SimpleDateFormat waktu = new SimpleDateFormat("HH:mm");
                if(message.getText().toString().isEmpty()){
                    Toast.makeText(ChatActivity.this, "Masukkan pesan anda terlebih dahulu", Toast.LENGTH_SHORT).show();
                }else{
                    ChatDataModel chat_kirim = new ChatDataModel("1","1", message.getText().toString(), waktu.format(date));
                    chat_data.add(chat_kirim);
                    adapter.notifyDataSetChanged();
                    message.setText(null);
                }
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
