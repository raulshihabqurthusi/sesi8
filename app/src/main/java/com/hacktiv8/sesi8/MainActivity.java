package com.hacktiv8.sesi8;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mClubRv;

    private List<Club> mClubList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mClubRv = findViewById(R.id.club_rv);

        mClubList = new ArrayList<>();

        Club club = new Club();
        club.setNama("Arsenal");
        club.setLogo("https://dreamleague-soccer-kits.com/wp-content/uploads/2019/02/Arsenal-Team-512x512-Logo.png");
        club.setStadion("Emirates Stadium");
        mClubList.add(club);

        club = new Club();
        club.setNama("Manchester United");
        club.setLogo("https://dreamleague-soccer-kits.com/wp-content/uploads/2019/02/Manchester-United-logo.png");
        club.setStadion("Old Trafford");
        mClubList.add(club);

        club = new Club();
        club.setNama("Chelsea");
        club.setLogo("https://dreamleague-soccer-kits.com/wp-content/uploads/2019/04/Chelsea-DLS-Team-Logo.png");
        club.setStadion("Stamford Bridge");
        mClubList.add(club);

        club = new Club();
        club.setNama("Liverpool");
        club.setLogo("https://dreamleague-soccer-kits.com/wp-content/uploads/2019/02/Liverpool-logo.png");
        club.setStadion("Anfield");
        mClubList.add(club);

        ClubAdapter clubAdapter = new ClubAdapter(this, mClubList);
        mClubRv.setAdapter(clubAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mClubRv.setLayoutManager(layoutManager);

    }
}