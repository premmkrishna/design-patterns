package com.gangoffour.patterns.behavioral.iterator;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Channel {

    private double frequency;
    private String name;

    @Override
    public String toString() {
        return "Frequency=" + this.frequency + ", name=" + this.name;
    }

}
