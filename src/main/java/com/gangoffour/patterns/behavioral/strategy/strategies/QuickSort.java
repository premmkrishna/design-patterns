package com.gangoffour.patterns.behavioral.strategy.strategies;

import com.gangoffour.patterns.behavioral.strategy.SortStrategy;

import java.util.Random;

public class QuickSort implements SortStrategy {

    private int partition(int[] array, int low, int high) {
        int j, temp, i = low + 1;
        Random random = new Random();
        int x = random.nextInt(high - low) + low;
        temp = array[low];
        array[low] = array[x];
        array[x] = temp;
        for (j = low + 1; j <= high; j++) {
            if (array[j] <= array[low] && j != i) {
                temp = array[j];
                array[j] = array[i];
                array[i++] = temp;
            } else if (array[j] <= array[low]) {
                i++;
            }
        }
        temp = array[i - 1];
        array[i - 1] = array[low];
        array[low] = temp;
        return i - 1;
    }

    private int[] quickSort(int[] array, int low, int high) {
        if (low < high) {
            int mid = partition(array, low, high);
            quickSort(array, low, mid - 1);
            quickSort(array, mid + 1, high);
        }
        return array;
    }

    @Override
    public int[] sort(int[] numbers) {
        return quickSort(numbers, 0, numbers.length - 1);
    }
}
