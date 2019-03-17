package com.gangoffour.patterns.behavioral.observer;


interface Observer {

    void update();

    void setSubject(Subject subject);
}