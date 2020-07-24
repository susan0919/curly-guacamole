package com.example.degsignmodel.mediaState;

import com.example.degsignmodel.utils.Constants;

class StopPlayState extends PlayerState {
    public StopPlayState(IPlayer player) {
        super(player);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case Constants.VideoPlayerConstants.PLAY_OR_PAUSE:
            case Constants.VideoPlayerConstants.NEXT:
            case Constants.VideoPlayerConstants.PRE:
                player.setState(new PrepareState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }

    }
}
