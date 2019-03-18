package com.gangoffour.patterns.behavioral.state.states;

import com.gangoffour.patterns.behavioral.state.Regulator;
import com.gangoffour.patterns.behavioral.state.State;

public class Fast implements State {

    @Override
    public void increaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new TurnOff());
    }

    @Override
    public void decreaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new Medium());
    }
}
