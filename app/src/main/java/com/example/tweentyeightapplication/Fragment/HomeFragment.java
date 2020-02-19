package com.example.tweentyeightapplication.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tweentyeightapplication.Adapter.HomeAdapter;
import com.example.tweentyeightapplication.Users.HomeUsers;
import com.example.tweentyeightapplication.R;

import java.util.ArrayList;
import java.util.List;


public class HomeFragment extends Fragment {
    private RecyclerView homeRecyclerView;
    private List<HomeUsers> homeUsersList = new ArrayList<>();
    private HomeAdapter homeAdapter;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        homeRecyclerView = view.findViewById(R.id.home_recycler_view_Id);

        HomeUsers homeUsers1 = new HomeUsers(R.drawable.orin_pic, R.drawable.add, "Add to story");
        HomeUsers homeUsers2 = new HomeUsers(R.drawable.wedding_photo, R.drawable.wedding_logo, "Wedding photo");
        HomeUsers homeUsers3 = new HomeUsers(R.drawable.orin_pic, R.drawable.foodpanda_logo, "Foodpanda");
        HomeUsers homeUsers4 = new HomeUsers(R.drawable.orin_pic, R.drawable.dress_collection_logo, "Dress collection");
        HomeUsers homeUsers5 = new HomeUsers(R.drawable.orin_pic, R.drawable.marketing_logo, "Marketing");
        HomeUsers homeUsers6 = new HomeUsers(R.drawable.orin_pic, R.drawable.wedding_logo, "photo");
        HomeUsers homeUsers7 = new HomeUsers(R.drawable.orin_pic, R.drawable.wedding_logo, "Bangladesh");
        homeUsersList.add(homeUsers1);
        homeUsersList.add(homeUsers2);
        homeUsersList.add(homeUsers3);
        homeUsersList.add(homeUsers4);
        homeUsersList.add(homeUsers5);
        homeUsersList.add(homeUsers6);
        homeUsersList.add(homeUsers7);

        homeAdapter = new HomeAdapter(homeUsersList, getActivity());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        homeRecyclerView.setLayoutManager(linearLayoutManager);
        homeRecyclerView.setAdapter(homeAdapter);
        return view;
    }

}
