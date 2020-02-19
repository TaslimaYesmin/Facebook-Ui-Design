package com.example.tweentyeightapplication.Fragment;


import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.tweentyeightapplication.Adapter.WatchAdapter;
import com.example.tweentyeightapplication.R;
import com.example.tweentyeightapplication.Users.WatchUsers;

import java.util.ArrayList;
import java.util.List;

public class WatchFragment extends Fragment {
    private RecyclerView watchRecyclerView;
    private List<WatchUsers> watchUsersList;
    private WatchAdapter watchAdapter;


    public WatchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_watch, container, false);
        watchRecyclerView = view.findViewById(R.id.watch_recyclerView_Id);

        watchUsersList = new ArrayList<>();
        WatchUsers watchUsers1 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers2 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers3 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers4 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers5 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers6 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers7 = new WatchUsers(R.drawable.health_tips, "Health");
        WatchUsers watchUsers8 = new WatchUsers(R.drawable.health_tips, "Health");
        watchUsersList.add(watchUsers1);
        watchUsersList.add(watchUsers2);
        watchUsersList.add(watchUsers3);
        watchUsersList.add(watchUsers4);
        watchUsersList.add(watchUsers5);
        watchUsersList.add(watchUsers6);
        watchUsersList.add(watchUsers7);
        watchUsersList.add(watchUsers8);

        watchAdapter = new WatchAdapter(watchUsersList, getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        watchRecyclerView.setLayoutManager(linearLayoutManager);

        watchRecyclerView.setAdapter(watchAdapter);

         return view;
    }


}
