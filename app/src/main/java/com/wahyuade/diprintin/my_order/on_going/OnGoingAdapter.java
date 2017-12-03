package com.wahyuade.diprintin.my_order.on_going;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;

import com.wahyuade.diprintin.R;
import com.wahyuade.diprintin.my_order.on_going.chat.ChatActivity;

/**
 * Created by wahyu on 12/3/2017.
 */

public class OnGoingAdapter extends RecyclerView.Adapter<OnGoingAdapter.ListOngoing> {
    private Activity activity;

    public OnGoingAdapter(Activity activity) {
        this.activity = activity;
    }

    @Override
    public ListOngoing onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_ongoing, parent, false);
        return new ListOngoing(v);
    }

    @Override
    public void onBindViewHolder(final ListOngoing holder, int position) {
        holder.more_ongoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(activity, holder.more_ongoing);
                MenuInflater menuInflater = popupMenu.getMenuInflater();
                menuInflater.inflate(R.menu.list_more_ongoing, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.chat:
                                Intent chat = new Intent(activity, ChatActivity.class);
                                activity.startActivity(chat);
                                break;
                            case R.id.detail:

                                break;
                            case R.id.cancel:

                                break;
                        }
                        return true;
                    }
                });
                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return 1;
    }

    public class ListOngoing extends RecyclerView.ViewHolder {
        private ImageView more_ongoing;
        public ListOngoing(View itemView) {
            super(itemView);
            more_ongoing = (ImageView)itemView.findViewById(R.id.more_ongoing);
        }
    }
}
