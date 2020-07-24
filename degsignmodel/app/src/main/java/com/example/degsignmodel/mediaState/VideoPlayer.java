package com.example.degsignmodel.mediaState;

public class VideoPlayer extends IPlayer {
    private PlayerState state = new StopPlayState(this);

    @Override
    public void request(int action) {
        System.out.println("before action:" + state.toString());
        state.handle(action);
        System.out.println("after action:" + state.toString());
    }

    @Override
    public void setState(PlayerState state) {
        this.state = state;
    }

    @Override
    public void play() {
        System.out.println("play");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }

    @Override
    public void pause() {
        System.out.println("pause");
    }

    @Override
    public void showAd() {
        System.out.println("showAd");
    }
}
