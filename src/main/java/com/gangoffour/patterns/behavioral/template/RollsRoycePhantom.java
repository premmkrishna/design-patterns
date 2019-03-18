package com.gangoffour.patterns.behavioral.template;

public class RollsRoycePhantom extends VechicleTemplate {
    @Override
    protected void fitSeats() {
        System.out.println("Fitting high quality leather seats");
        setCost(getCost() + 10000);
    }

    @Override
    protected void fitBody() {
        System.out.println("Fitting exclusive metal body");
        setCost(getCost() + 500000);
    }

    @Override
    protected void fitSuspensions() {
        System.out.println("Fitting 10x suspensions");
        setCost(getCost() + 140000);
    }

    @Override
    void fitDoors() {
        System.out.println("Fitting remote and fingerprint enabled doors");
        setCost(getCost() + 80000);
    }
}
