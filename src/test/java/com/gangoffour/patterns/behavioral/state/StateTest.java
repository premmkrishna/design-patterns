package com.gangoffour.patterns.behavioral.state;

import com.gangoffour.patterns.behavioral.state.states.Medium;
import com.gangoffour.patterns.behavioral.state.states.Slow;
import com.gangoffour.patterns.behavioral.state.states.TurnOff;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StateTest {

    @Test
    public void testStates() {
        Regulator regulator = new Regulator();
        Assert.assertEquals(Slow.class, regulator.getCurrentSpeed().getClass());
        regulator.increaseSpeed();
        Assert.assertEquals(Medium.class, regulator.getCurrentSpeed().getClass());
        regulator.decreaseSpeed();
        Assert.assertEquals(Slow.class, regulator.getCurrentSpeed().getClass());
        regulator.decreaseSpeed();
        Assert.assertEquals(TurnOff.class, regulator.getCurrentSpeed().getClass());
    }
}
