package com.example.degsignmodel.state;

public interface IState {
    /**
     * 放钱
     */
    public void insertMoney();

    /**
     * 退钱
     */
    public void backMoney();

    /**
     * 转动手柄
     */
    public void turnTrunk();

    /**
     * 出商品
     */
    public void dispense();

    /**
     * 获取状态信息
     */

    public String getMsg();
}
