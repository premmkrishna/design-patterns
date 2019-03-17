package com.gangoffour.patterns.behavioral.iterator;

import lombok.Data;

import java.util.List;

@Data
public class ChannelIterator implements Iterator<Channel> {
    private List<Channel> channels;
    private int position;

    @Override
    public void reset() {
        position = 0;
    }

    @Override
    public Channel next() {
        return channels.get(++position);
    }

    @Override
    public Channel currentItem() {
        return channels.get(position);
    }

    @Override
    public boolean hasNext() {
        return position < channels.size() - 1;
    }
}
