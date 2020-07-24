package com.example.degsignmodel.mediaState;

import com.example.degsignmodel.utils.Constants;

public class PlayingState extends PlayerState {
    public PlayingState(IPlayer iPlayer) {
        super(iPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case Constants.VideoPlayerConstants.PLAY_OR_PAUSE:
                player.pause();
                player.setState(new PauseState(player));
                break;
            case Constants.VideoPlayerConstants.STOP:
                player.stop();
                player.setState(new StopPlayState(player));
                break;
            case Constants.VideoPlayerConstants.SHOW_AD:
                player.showAd();
                player.setState(new ShowAddState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }

    }
}
