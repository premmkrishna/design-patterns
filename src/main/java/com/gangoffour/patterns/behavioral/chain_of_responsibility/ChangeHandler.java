package com.gangoffour.patterns.behavioral.chain_of_responsibility;

abstract class ChangeHandler {
    ChangeHandler changeHandler;

    public void nextHandler(ChangeHandler changeHandler) {
        this.changeHandler = changeHandler;
    }

    public abstract void fetchChange(long givenAmount);
}
