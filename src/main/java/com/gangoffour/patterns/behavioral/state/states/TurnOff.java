package com.gangoffour.patterns.behavioral.state.states;

import com.gangoffour.patterns.behavioral.state.Regulator;
import com.gangoffour.patterns.behavioral.state.State;

public class TurnOff implements State {

    @Override
    public void increaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new Slow());
    }

    @Override
    public void decreaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new Fast());
    }
}
