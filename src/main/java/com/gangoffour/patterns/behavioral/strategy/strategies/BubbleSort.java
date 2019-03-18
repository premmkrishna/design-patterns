package com.gangoffour.patterns.behavioral.strategy.strategies;

import com.gangoffour.patterns.behavioral.strategy.SortStrategy;

public class BubbleSort implements SortStrategy {
    @Override
    public int[] sort(int[] numbers) {
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap temp and numbers[i]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}
