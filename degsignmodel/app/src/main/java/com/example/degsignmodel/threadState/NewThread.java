package com.example.degsignmodel.threadState;

public class NewThread extends ThreadState {

    public NewThread() {
        stateName = "新建状态";
        System.out.println("当前线程处于：新建状态.");
    }

    public void start(ThreadContext context) {
        System.out.print("调用start()方法-->");
        if (stateName.equals("新建状态")) {
            context.setState(new RunnableState());
        } else {
            System.out.println("当前线程不是新建状态，不能调用start()方法.");
        }
    }
}
