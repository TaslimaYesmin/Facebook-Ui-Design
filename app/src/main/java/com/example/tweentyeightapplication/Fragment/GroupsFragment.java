package com.example.tweentyeightapplication.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tweentyeightapplication.Adapter.GroupAdapter;
import com.example.tweentyeightapplication.Users.GroupUsers;
import com.example.tweentyeightapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class GroupsFragment extends Fragment {
private RecyclerView groupRecyclerView;
private List<GroupUsers>groupUsersList=new ArrayList<>();;
private GroupAdapter groupAdapter;

    public GroupsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_groups, container, false);
        groupRecyclerView=view.findViewById(R.id.groups_recyclerView_Id);

         GroupUsers groupUsers1=new GroupUsers(R.drawable.orin_pic,"13th convocation");
        GroupUsers groupUsers2=new GroupUsers(R.drawable.orin_pic,"Add to story");
        GroupUsers groupUsers3=new GroupUsers(R.drawable.orin_pic,"Add to story");
        GroupUsers groupUsers4=new GroupUsers(R.drawable.orin_pic,"Add to story");
        GroupUsers groupUsers5=new GroupUsers(R.drawable.orin_pic,"Add to story");
        GroupUsers groupUsers6=new GroupUsers(R.drawable.orin_pic,"Add to story");
        GroupUsers groupUsers7=new GroupUsers(R.drawable.orin_pic,"Add to story");
        GroupUsers groupUsers8=new GroupUsers(R.drawable.orin_pic,"Add to story");

        groupUsersList.add(groupUsers1);
        groupUsersList.add(groupUsers2);
        groupUsersList.add(groupUsers3);
        groupUsersList.add(groupUsers4);
        groupUsersList.add(groupUsers5);
        groupUsersList.add(groupUsers6);
        groupUsersList.add(groupUsers7);
        groupUsersList.add(groupUsers8);
        groupAdapter=new GroupAdapter(groupUsersList,getActivity());
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        groupRecyclerView.setLayoutManager(linearLayoutManager);
        groupRecyclerView.setAdapter(groupAdapter);
        return view;
    }

}
