package com.example.degsignmodel.weatherDataObserver;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.degsignmodel.R;

public class WeatherDataActivity extends AppCompatActivity implements View.OnClickListener {
    private Button showButton;
    private TextView msgTextView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        showButton = findViewById(R.id.show_msg);
        msgTextView = findViewById(R.id.msg);
        showButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.show_msg:
//                msgTextView.setText();
                showEvent();
                break;
            default:
                break;
        }
    }

    private void showEvent() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay =
                new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurement(80, 65, 25f);
    }
}
