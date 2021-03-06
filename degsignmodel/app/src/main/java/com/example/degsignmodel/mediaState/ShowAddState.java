package com.example.degsignmodel.mediaState;

import com.example.degsignmodel.utils.Constants;

public class ShowAddState extends PlayerState {
    public ShowAddState(IPlayer iPlayer) {
        super(iPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case Constants.VideoPlayerConstants.PLAY_OR_PAUSE:
                player.play();
                player.setState(new PlayingState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + "," + this.toString());
        }
    }
}
