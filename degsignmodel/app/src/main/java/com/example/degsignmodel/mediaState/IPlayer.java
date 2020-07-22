package com.example.degsignmodel.mediaState;

public interface IPlayer {
    void request();
    void setState(PlayerState state);
    void play();
    void stop();
    void pause();
    void addAd();
}
