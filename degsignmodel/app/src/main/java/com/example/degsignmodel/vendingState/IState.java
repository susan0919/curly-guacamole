package com.example.degsignmodel.vendingState;

public interface IState {
    /**
     * 放钱
     */
    void insertMoney();

    /**
     * 退钱
     */
    void backMoney();

    /**
     * 转动手柄
     */
    void turnTrunk();

    /**
     * 出商品
     */
    void dispense();

    String getMsg();

}
