package com.example.degsignmodel.threadState;

public class RunnableState extends ThreadState {

    public RunnableState() {
        stateName = "就緒狀態";
        System.out.println("当前线程处于：就绪状态.");
    }

    public void getCpu(ThreadContext context) {
        System.out.print("获得CPU时间-->");
        if (stateName.equals("就緒狀態")) {
            context.setState(new RunningState());
        } else {
            System.out.println("当前线程不是就绪状态，不能获取CPU.");
        }
    }
}
