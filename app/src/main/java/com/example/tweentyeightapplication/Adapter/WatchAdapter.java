package com.example.tweentyeightapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tweentyeightapplication.R;
import com.example.tweentyeightapplication.Users.WatchUsers;

import java.util.List;

public class WatchAdapter extends RecyclerView.Adapter<WatchAdapter.ViewHolder> {
    private List<WatchUsers>watchUsersList;
    private Context context;

    public WatchAdapter(List<WatchUsers> watchUsersList, Context context) {
        this.watchUsersList = watchUsersList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
      View itemView =  LayoutInflater.from(context).inflate(R.layout.item_watch_recycler_view,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    WatchUsers watchUsers = watchUsersList.get(position);
    holder.watchImageView.setImageResource(watchUsers.getImage());
    holder.watchTextView.setText(watchUsers.getAddStoryText());
    }

    @Override
    public int getItemCount() {
        return watchUsersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView watchImageView;
        private TextView watchTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            watchImageView=itemView.findViewById(R.id.watch_profileImage_Id);
            watchTextView=itemView.findViewById(R.id.watch_addStoryText_Id);
        }
    }
}
