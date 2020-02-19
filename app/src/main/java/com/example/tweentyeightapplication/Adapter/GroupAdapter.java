package com.example.tweentyeightapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tweentyeightapplication.Users.GroupUsers;
import com.example.tweentyeightapplication.R;

import java.util.List;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.ViewHolder> {
    private List<GroupUsers>groupUsersList;
    private Context context;

    public GroupAdapter(List<GroupUsers> groupUsersList, Context context) {
        this.groupUsersList = groupUsersList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_groups_recycler_view,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    GroupUsers users = groupUsersList.get(position);
    holder.groupsProfileImage.setImageResource(users.getGroupProfileImage());
    holder.groupsTextView.setText(users.getStoryText());
    }

    @Override
    public int getItemCount() {
        return  groupUsersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView groupsProfileImage;
        private TextView groupsTextView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            groupsProfileImage=itemView.findViewById(R.id.groups_profileImage_Id);
            groupsTextView=itemView.findViewById(R.id.groups_addStoryText_Id);

        }
    }
}
