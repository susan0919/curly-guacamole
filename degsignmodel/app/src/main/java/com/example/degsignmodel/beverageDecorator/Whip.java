package com.example.degsignmodel.beverageDecorator;

public class Whip extends CondimDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return 0.45 + beverage.cost();
    }
}
