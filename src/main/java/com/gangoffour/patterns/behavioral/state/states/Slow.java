package com.gangoffour.patterns.behavioral.state.states;

import com.gangoffour.patterns.behavioral.state.Regulator;
import com.gangoffour.patterns.behavioral.state.State;

public class Slow implements State {

    @Override
    public void increaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new Medium());
    }

    @Override
    public void decreaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new TurnOff());
    }
}
