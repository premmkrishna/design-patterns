package com.gangoffour.patterns.behavioral.observer;

interface Subject {

    void registerObserver(Observer observer);

    void notifyObserver();

    void unRegisterObserver(Observer observer);

    Object getUpdate();

}