package com.example.degsignmodel.threadState;

public class StopState extends ThreadState {

    public StopState() {
        stateName = "死亡狀態";
        System.out.println("当前线程处于：死亡狀態.");
    }

}
