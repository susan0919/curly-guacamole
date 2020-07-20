package com.example.degsignmodel.threadState;

public class BlockedState extends ThreadState {
    public BlockedState() {
        stateName = "阻塞狀態";
        System.out.println("当前线程处于：阻塞狀態.");
    }

    public void resume(ThreadContext context) {
        System.out.print("resume-->");
        if (stateName.equals("阻塞狀態")) {
            context.setState(new RunnableState());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }

}
