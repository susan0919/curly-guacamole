package com.example.degsignmodel.mediaState;

public class ShowAddState extends PlayerState {
    public ShowAddState(IPlayer iPlayer) {
        super(iPlayer);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PlayingState.PLAY_OR_PAUSE:
                player.play();
                player.setState(new PlayingState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + "," + this.toString());
        }
    }
}
