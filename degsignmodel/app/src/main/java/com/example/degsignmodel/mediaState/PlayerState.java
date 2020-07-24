package com.example.degsignmodel.mediaState;

import androidx.annotation.NonNull;

public abstract class PlayerState {
    public IPlayer player;

    public static final int PLAY_OR_PAUSE = 0;
    public static final int STOP = 1;
    public static final int SHOW_AD = 2;

    public PlayerState(IPlayer iPlayer) {
        this.player = iPlayer;
    }

    public abstract void handle(int action);

    @NonNull
    @Override
    public String toString() {
        return "current state:" + this.getClass().getName();
    }
}
