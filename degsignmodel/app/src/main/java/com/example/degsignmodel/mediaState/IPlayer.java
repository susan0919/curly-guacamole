package com.example.degsignmodel.mediaState;

public abstract class IPlayer {
    public abstract void request(int action);

    public abstract void setState(PlayerState state);

    public abstract void play();

    public abstract void stop();

    public abstract void pause();

    public abstract void showAd();
}
