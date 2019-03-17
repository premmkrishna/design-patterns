package com.gangoffour.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class GradeSystem implements Subject {

    private final List<Observer> observersList;
    private boolean stateChange;

    public GradeSystem() {
        this.observersList = new ArrayList<>();
        stateChange = false;
    }

    @Override
    public void registerObserver(Observer observer) {
        observersList.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observersList.remove(observer);
    }

    @Override
    public void notifyObserver() {

        if (stateChange) {
            for (Observer observer : observersList) {
                observer.update();
            }
        }
    }

    @Override
    public Object getUpdate() {
        Object changedState = null;
        if (stateChange) {
            changedState = 5;
        }
        return changedState;
    }

    public void increaseMarks() {
        stateChange = true;
        notifyObserver();
    }

}