package com.example.degsignmodel.mediaState;

import com.example.degsignmodel.utils.Constants;

public class PauseState extends PlayerState {
    public PauseState(IPlayer iPlayer) {
        super(iPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case Constants.VideoPlayerConstants.PLAY_OR_PAUSE:
                player.play();
                player.setState(new PlayingState(player));
                break;
            case Constants.VideoPlayerConstants.STOP:
                player.stop();
                player.setState(new StopPlayState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }

    }
}
