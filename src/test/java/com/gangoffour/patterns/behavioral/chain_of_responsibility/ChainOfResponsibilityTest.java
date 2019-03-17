package com.gangoffour.patterns.behavioral.chain_of_responsibility;

import com.gangoffour.patterns.behavioral.chain_of_responsibility.ChangeHandler;
import com.gangoffour.patterns.behavioral.chain_of_responsibility.HundredDollarHandler;
import com.gangoffour.patterns.behavioral.chain_of_responsibility.OneDollarHandler;
import com.gangoffour.patterns.behavioral.chain_of_responsibility.TenDollarHandler;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ChainOfResponsibilityTest
{
    public ChangeHandler hundredsHandler;
    public ChangeHandler tensHandler;
    public ChangeHandler onesHandler ;

    @Before
    public void setUp(){
        hundredsHandler = new HundredDollarHandler();
        tensHandler = new TenDollarHandler();
        onesHandler = new OneDollarHandler();
        hundredsHandler.nextHandler(tensHandler);
        tensHandler.nextHandler(onesHandler);
    }

    @Test
    public void getChangeFor300(){
        hundredsHandler.fetchChange(300L);
    }

    @Test
    public void getChangeFor310(){
        hundredsHandler.fetchChange(310L);
    }

    @Test
    public void getChangeFor355(){
        hundredsHandler.fetchChange(355L);
    }
}
