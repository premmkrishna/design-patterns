package com.gangoffour.patterns.behavioral.template;

abstract class VechicleTemplate {
    private int cost = 0;

    void buildVechicle() {
        fitBody();
        fitSeats();
        fitDoors();
        fitBrakes();
        fitSuspensions();
    }

    protected abstract void fitSeats();

    protected abstract void fitBody();

    protected abstract void fitSuspensions();

    abstract void fitDoors();

    private void fitBrakes() {
        System.out.println("Provided ABS locking brakes");
        cost += 6000;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
