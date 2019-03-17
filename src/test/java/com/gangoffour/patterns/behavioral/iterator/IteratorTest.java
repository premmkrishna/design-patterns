package com.gangoffour.patterns.behavioral.iterator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.gangoffour.patterns.behavioral.iterator.Channel.builder;
import static org.junit.Assert.assertEquals;

public class IteratorTest {
    private List<Channel> channels;

    @Before
    public void setUp() {
        channels = new ArrayList<>();
        Channel mtv = builder().name("MTV").frequency(111).build();
        Channel national_geographic = builder().name("National Geographic").frequency(222).build();
        Channel cartoon_network = builder().name("Cartoon Network").frequency(333).build();
        Channel animal_planet = builder().name("Animal Planet").frequency(444).build();
        Channel hbo = builder().name("HBO").frequency(555).build();
        channels.add(mtv);
        channels.add(national_geographic);
        channels.add(cartoon_network);
        channels.add(animal_planet);
        channels.add(hbo);
    }

    @Test
    public void testIterator() {
        ChannelIterator iterator = new ChannelIterator();
        iterator.setChannels(channels);
        while (iterator.hasNext()) {
            Channel next = iterator.next();
            System.out.println("Channel: " + next.getName() + " Frequency: " + next.getFrequency());
        }
        iterator.reset();
        assertEquals("MTV", iterator.currentItem().getName());
        iterator.next();
        assertEquals("National Geographic", iterator.currentItem().getName());
    }
}
