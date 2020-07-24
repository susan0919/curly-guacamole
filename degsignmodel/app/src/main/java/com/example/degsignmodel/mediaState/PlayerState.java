package com.example.degsignmodel.mediaState;

import androidx.annotation.NonNull;

public abstract class PlayerState {
    public IPlayer player;

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
