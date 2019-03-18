package com.gangoffour.patterns.behavioral.strategy;

import com.gangoffour.patterns.behavioral.strategy.strategies.BubbleSort;
import com.gangoffour.patterns.behavioral.strategy.strategies.InsertionSort;
import com.gangoffour.patterns.behavioral.strategy.strategies.QuickSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class StrategyTest {

    @Test
    public void sortUsingDifferentStrategies() {
        int[] arr = new int[]{99, 22, 33, 44, 101, 55};
        Sorter sorter = new Sorter();
        sorter.setStrategy(new BubbleSort());
        int[] sorted = sorter.sort(arr);
        Assert.assertEquals(22, sorted[0]);
        sorter.setStrategy(new QuickSort());
        sorted = sorter.sort(arr);
        Assert.assertEquals(22, sorted[0]);
        sorter.setStrategy(new InsertionSort());
        sorted = sorter.sort(arr);
        Assert.assertEquals(22, sorted[0]);
    }
}
