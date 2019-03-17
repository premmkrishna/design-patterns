package com.gangoffour.patterns.behavioral.chain_of_responsibility;

public class TenDollarHandler extends ChangeHandler {

    @Override
    public void fetchChange(long givenAmount)
    {
        if (givenAmount > 0)
        {
            System.out.println("Fetched "+givenAmount+" 1 notes from ATM machine");
        }
    }
}
