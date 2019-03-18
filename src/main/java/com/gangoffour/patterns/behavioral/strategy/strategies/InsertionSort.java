package com.gangoffour.patterns.behavioral.strategy.strategies;

import com.gangoffour.patterns.behavioral.strategy.SortStrategy;

public class InsertionSort implements SortStrategy {
    @Override
    public int[] sort(int[] numbers) {
        int i, key, j;
        for (i = 1; i < numbers.length; i++) {
            key = numbers[i];
            j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j = j - 1;
            }
            numbers[j + 1] = key;
        }
        return numbers;
    }
}
