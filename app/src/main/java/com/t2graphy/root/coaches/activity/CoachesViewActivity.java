package com.t2graphy.root.coaches.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.t2graphy.coaches.R;
import com.t2graphy.root.coaches.model.CoachesData;
import com.t2graphy.root.coaches.controller.CoachesViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class CoachesViewActivity extends AppCompatActivity {

    CoachesViewAdapter coachesViewAdapter;
    RecyclerView recyclerView;
    View.OnClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coaches_root_activity_view);

        recyclerView = findViewById(R.id.coaches_recycler_view);

        List<CoachesData> coachesDataList = getData();

        listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int index = 2;
            }
        };
        Log.i("FightingChoice", "OnCreateFragment");
        coachesViewAdapter
                = new CoachesViewAdapter(
                coachesDataList, getApplicationContext(), listener);
    }

    @Override
    public void onResume() {
        super.onResume();

        recyclerView.setAdapter(coachesViewAdapter);
        recyclerView.setLayoutManager(
                new LinearLayoutManager(getApplicationContext()));
    }


    /**
     * ToDo As per Solid principle, this class should not load data. as it will get more responsibility
     * You already wrote Data layer in different project structure, review that part of code, optimized it if needed and then do the integration
     * by doing this you will be able to validate unit test part and behaviour part
     **/
    private List<CoachesData> getData() {
        List<CoachesData> list = new ArrayList<>();
        list.add(new CoachesData(R.drawable.coaches_hasan_muay_thai_kick_boxing,
                "Name : Hassan S1r",
                "Speciality : Kick Boxing", 4.8F, "Experience : 7 years",
                "book one to one session", ""));
        list.add(new CoachesData(R.drawable.coaches_lalit_kick_boxing,
                "Name : Lalit S1r",
                "Speciality Kick Boxing", 4.7F, "Experience : 3 years",
                "book one to one session", ""));
        list.add(new CoachesData(R.drawable.coaches_mohan_wresting,
                "Name : Mohan Sir",
                "Speciality : Kick Boxing", 4.7F, "Experience : 5 years",
                "book one to one session", ""));
        list.add(new CoachesData(R.drawable.coaches_malkeet_bjj_grapling,
                "Name : Malkreet Brawler",
                "Speciality : MMA, Grappling", 4.8F, "Experience : 7 years",
                "book one to one session", ""));

        return list;
    }
}