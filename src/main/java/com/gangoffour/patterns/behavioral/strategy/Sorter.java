package com.gangoffour.patterns.behavioral.strategy;

import lombok.Setter;

public class Sorter {
    @Setter
    SortStrategy strategy;

    public int[] sort(int[] inp) {
        return strategy.sort(inp);
    }
}
