package com.example.degsignmodel.mediaState;

public interface IPlayer {
     void request(int action);

     void setState(PlayerState state);

     void play();

     void stop();

     void pause();

     void showAd();
}
