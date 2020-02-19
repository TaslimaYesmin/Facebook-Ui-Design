package com.example.tweentyeightapplication.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tweentyeightapplication.Users.HomeUsers;
import com.example.tweentyeightapplication.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.ViewHolder> {
    private List<HomeUsers>homeUsersList;
    private Context context;

    public HomeAdapter(List<HomeUsers> homeUsersList, Context context) {
        this.homeUsersList = homeUsersList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_home_recycler_view,parent,false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    HomeUsers users = homeUsersList.get(position);
    holder.profileImageView.setImageResource(users.getProfileImage());
    holder.circleImageView.setImageResource(users.getCircleImageLogo());
    holder.storyText.setText(users.getStoryText());
    }

    @Override
    public int getItemCount() {
        return homeUsersList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView profileImageView;
        private CircleImageView circleImageView;
        private TextView storyText;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImageView=itemView.findViewById(R.id.profileImage_Id);
            circleImageView=itemView.findViewById(R.id.circleImageLogo_Id);
            storyText=itemView.findViewById(R.id.addStoryText_Id);
        }
    }
}
