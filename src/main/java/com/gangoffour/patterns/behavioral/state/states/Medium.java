package com.gangoffour.patterns.behavioral.state.states;

import com.gangoffour.patterns.behavioral.state.Regulator;
import com.gangoffour.patterns.behavioral.state.State;

public class Medium implements State {

    @Override
    public void increaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new Fast());
    }

    @Override
    public void decreaseSpeed(Regulator regulator) {
        regulator.setCurrentSpeed(new Slow());
    }
}
