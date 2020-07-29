package com.example.degsignmodel.LawProxy;

public class Xiaomin implements ILawsuit {
    @Override
    public void submit() {
        System.out.print("老板拖欠工资，特此申请仲裁");
    }

    @Override
    public void burden() {
        System.out.print("这是合同和去年一年的银行工资流水");
    }

    @Override
    public void defend() {
        System.out.print("证据确凿，不需要说什么了");
    }

    @Override
    public void finish() {
        System.out.print("诉讼成功，老板七日内结算工资");
    }
}
