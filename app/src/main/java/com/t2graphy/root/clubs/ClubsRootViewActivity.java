package com.t2graphy.root.clubs;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.t2graphy.coaches.R;

import java.util.ArrayList;
import java.util.List;

public class ClubsRootViewActivity extends AppCompatActivity {
    ClubsViewAdapter clubsViewAdapter;
    RecyclerView recyclerView;
    View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clubs_root_activity_view);

        recyclerView = findViewById(R.id.clubs_recycler_view);

        List<ClubsData> clubssDataList = getData();

        listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = 2;
            }
        };
        Log.i("FightingChoice", "OnCreateFragment");
        clubsViewAdapter
                = new ClubsViewAdapter(
                clubssDataList, getApplicationContext(), listener);
    }

    @Override
    public void onResume() {
        super.onResume();

        recyclerView.setAdapter(clubsViewAdapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getApplicationContext()));
    }

    private List<ClubsData> getData() {
        List<ClubsData> list = new ArrayList<>();
        list.add(new ClubsData(R.drawable.coaches_malkeet_bjj_grapling,
                "Fighting Choice Noida Sector 51", "Head Coach : Shekhar",
                "Total Students Trained : 4002", "Active Students : 34",
                "Open for 6AM : 10PM, Gym Weights, Changing Room, Shower", ""));
        list.add(new ClubsData(R.drawable.coaches_hasan_muay_thai_kick_boxing,
                "Fighting Choice Noida Sector 141", "Head Coach : Hasan",
                "Total Students Trained : 3220", "Active Students : 23",
                "Open for 6AM : 10PM, Gym Weights,Changing Room, Shower", ""));
        list.add(new ClubsData(R.drawable.coaches_mohan_wresting,
                "Fighting Choice GreaterNoida ", "Head Coach : Mohan",
                "Total Students Trained : 2100", "Active Students : 12",
                "Open for 6AM : 10PM, Gym Weights, Changing Room, Shower", ""));
        list.add(new ClubsData(R.drawable.coaches_malkeet_bjj_grapling,
                "Fighting Choice Noida Extension", "Head Coach : Malkeet ",
                "Total Students Trained : 1230", "Active Students : 21",
                "Open for 6AM : 10PM, Gym Weights,Changing Room, Shower", ""));

        return list;
    }
}
