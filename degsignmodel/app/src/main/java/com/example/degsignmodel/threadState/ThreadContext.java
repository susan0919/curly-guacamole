package com.example.degsignmodel.threadState;

public class ThreadContext {
    private ThreadState state;

    public ThreadContext() {
        state = new NewThread();
    }

    public void setState(ThreadState state) {
        this.state = state;
    }

    public ThreadState getState() {
        return this.state;
    }

    public void start() {
        ((NewThread) this.state).start(this);
    }

    public void getCpu() {

    }

    public void resume() {

    }

    public void suspend() {

    }

    public void stop() {

    }
}
