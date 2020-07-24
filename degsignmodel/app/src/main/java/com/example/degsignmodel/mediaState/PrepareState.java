package com.example.degsignmodel.mediaState;

import com.example.degsignmodel.utils.Constants;

public class PrepareState extends PlayerState {
    public PrepareState(IPlayer iPlayer) {
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
            case Constants.VideoPlayerConstants.SHOW_AD:
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + "," + this.toString());
        }
    }
}
