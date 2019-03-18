package com.gangoffour.patterns.behavioral.state;

import com.gangoffour.patterns.behavioral.state.states.Slow;

public class Regulator {
    private State currentSpeed;

    Regulator() {
        currentSpeed = new Slow();
    }

    public State getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(State currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void increaseSpeed() {
        currentSpeed.increaseSpeed(this);
    }

    public void decreaseSpeed() {
        currentSpeed.decreaseSpeed(this);
    }
}
