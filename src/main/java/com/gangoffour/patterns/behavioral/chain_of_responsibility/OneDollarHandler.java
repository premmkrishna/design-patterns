package com.gangoffour.patterns.behavioral.chain_of_responsibility;

public class OneDollarHandler extends ChangeHandler {

    @Override
    public void fetchChange(long givenAmount) {
        long numberofNotesToBeFetched = givenAmount / 10;
        if (numberofNotesToBeFetched > 0) {
            System.out.println("Fetched " + numberofNotesToBeFetched + " 100 notes from ATM machine");
        }
        long pendingNotes = givenAmount % 10;
        if (pendingNotes > 0) {
            changeHandler.fetchChange(pendingNotes);
        }
    }
}
