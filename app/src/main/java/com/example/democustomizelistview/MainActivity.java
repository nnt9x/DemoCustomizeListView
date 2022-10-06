package com.example.democustomizelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvApplications;

    private MyAdapter myAdapter;

    private List<ItemApplication> dataSource;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvApplications = findViewById(R.id.lvApplications);

        dataSource = new ArrayList<>();
        dataSource.add(new ItemApplication("Disney+",4.5f,"https://play-lh.googleusercontent.com/xoGGYH2LgLibLDBoxMg-ZE16b-RNfITw_OgXBWRAPin2FZY4FGB9QKBYApR-0rSCkQ=s96"));
        dataSource.add(new ItemApplication("Tiktok",4.4f,"https://play-lh.googleusercontent.com/xoGGYH2LgLibLDBoxMg-ZE16b-RNfITw_OgXBWRAPin2FZY4FGB9QKBYApR-0rSCkQ=s96"));
        dataSource.add(new ItemApplication("Youtube",4.8f,"https://play-lh.googleusercontent.com/xoGGYH2LgLibLDBoxMg-ZE16b-RNfITw_OgXBWRAPin2FZY4FGB9QKBYApR-0rSCkQ=s96"));

        myAdapter = new MyAdapter(this, dataSource);

        lvApplications.setAdapter(myAdapter);

    }
}