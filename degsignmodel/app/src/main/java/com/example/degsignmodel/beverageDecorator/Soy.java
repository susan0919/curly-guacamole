package com.example.degsignmodel.beverageDecorator;

public class Soy extends CondimDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ".Soy";
    }

    public double cost() {
        return 0.56 + beverage.cost();
    }
}
