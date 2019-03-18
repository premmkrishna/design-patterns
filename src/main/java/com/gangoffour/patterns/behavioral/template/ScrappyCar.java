package com.gangoffour.patterns.behavioral.template;

public class ScrappyCar extends VechicleTemplate {
    @Override
    protected void fitSeats() {
        System.out.println("Fitting normal leather seats");
        setCost(getCost() + 1000);
    }

    @Override
    protected void fitBody() {
        System.out.println("Fitting basic hard plastic metal combo");
        setCost(getCost() + 50000);
    }

    @Override
    protected void fitSuspensions() {
        System.out.println("Fitting 2x suspensions leather seats");
        setCost(getCost() + 14000);
    }

    @Override
    void fitDoors() {
        System.out.println("Fitting key enabled doors");
        setCost(getCost() + 8000);
    }
}
