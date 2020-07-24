package com.example.degsignmodel.mediaState;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;
import com.example.degsignmodel.utils.Constants;

import java.util.ArrayList;
import java.util.List;


public class PlayerStateActivity extends AppCompatActivity implements View.OnClickListener {
    private Button preButton;
    private Button playButton;
    private Button nextButton;
    private Button stopButton;
    private Button addAdButton;
    private ListView playList;
    private VideoPlayer player;
    private Adapter adapter;
    private List<String> list = new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_state);
        player = new VideoPlayer();
        initView();
        initListener();
    }


    private void initView() {
        preButton = findViewById(R.id.pre);
        playButton = findViewById(R.id.play);
        nextButton = findViewById(R.id.next);
        playList = findViewById(R.id.playlist);
        stopButton = findViewById(R.id.stop);
        addAdButton = findViewById(R.id.add_ad);
    }

    private void initListener() {
        preButton.setOnClickListener(this);
        playButton.setOnClickListener(this);
        nextButton.setOnClickListener(this);
        stopButton.setOnClickListener(this);
        addAdButton.setOnClickListener(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.pre:
            case R.id.play:
                player.request(Constants.VideoPlayerConstants.PREPARE);
                break;
            case R.id.next:
                player.request(Constants.VideoPlayerConstants.PLAY_OR_PAUSE);
                break;
            case R.id.stop:
                player.request(Constants.VideoPlayerConstants.STOP);
                break;
            case R.id.add_ad:
                player.request(Constants.VideoPlayerConstants.SHOW_AD);
                break;
            default:
                break;
        }
    }
}
