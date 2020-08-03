package com.example.degsignmodel.beverageDecorator;

public class Mocha extends CondimDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}
