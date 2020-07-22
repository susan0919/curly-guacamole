package com.example.degsignmodel.mediaState;

public class PauseState extends PlayerState {
    public PauseState(IPlayer iPlayer) {
        super(iPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PLAY_OR_PAUSE:
                player.play();
                player.setState(new PlayingState(player));
                break;
            case STOP:
                player.stop();
                player.setState(new StopPlayState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }

    }
}
