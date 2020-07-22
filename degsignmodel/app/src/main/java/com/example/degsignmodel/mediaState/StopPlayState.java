package com.example.degsignmodel.mediaState;

class StopPlayState extends PlayerState {
    public StopPlayState(IPlayer player) {
        super(player);
    }

    @Override
    public void handle(int action) {
        switch (action) {
            case PLAY_OR_PAUSE:
                player.play();
                player.setState(new PlayingState(player));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }

    }
}
