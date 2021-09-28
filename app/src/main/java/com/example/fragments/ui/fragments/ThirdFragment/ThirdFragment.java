package com.example.fragments.ui.fragments.ThirdFragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragments.R;
import com.example.fragments.data.UserService;
import com.example.fragments.ui.activityes.MainActivity2;


public class ThirdFragment extends Fragment implements UserAdapter.OnItemClick {

    private RecyclerView recyclerView;
    private UserAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.user_rv);
        adapter = new UserAdapter();
        UserService userService = new UserService();
        adapter.setList(userService.getUserList());
        adapter.setListener(this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void clickItem(String name) {
        Intent intent = new Intent(requireActivity(), MainActivity2.class);
        intent.putExtra("key", name);
        startActivity(intent);
    }
}