package com.gangoffour.patterns.behavioral.state;

public interface State {
    void increaseSpeed(Regulator regulator);

    void decreaseSpeed(Regulator regulator);
}
