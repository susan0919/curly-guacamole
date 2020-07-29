package com.example.degsignmodel.mediaState;

import static com.example.degsignmodel.utils.Constants.VideoPlayerConstants.PLAY_OR_PAUSE;
import static com.example.degsignmodel.utils.Constants.VideoPlayerConstants.STOP;

public class CompletedState extends PlayerState {
    public CompletedState(IPlayer iPlayer) {
        super(iPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PLAY_OR_PAUSE:
                player.pause();
                player.setState(new PauseState(player));
                break;
            case STOP:
                player.stop();
                player.setState(new StopPlayState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROR ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }
    }
}
