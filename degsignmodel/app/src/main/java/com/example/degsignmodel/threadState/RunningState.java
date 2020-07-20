package com.example.degsignmodel.threadState;

public class RunningState extends ThreadState {
    public RunningState() {
        stateName = "运行状态";
        System.out.println("当前线程处于：运行状态.");
    }

    public void suspend(ThreadContext context) {
        System.out.print("调用suspend()方法-->");
        if (stateName.equals("运行状态")) {
            context.setState(new BlockedState());
        } else {
            System.out.println("当前线程不是运行状态，不能调用suspend()方法.");
        }
    }

    public void stop(ThreadContext context) {
        System.out.print("调用stop()方法-->");
        if (stateName.equals("运行状态")) {
            context.setState(new StopState());
        } else {
            System.out.println("当前线程不是运行状态，不能调用stop()方法.");
        }
    }

}
