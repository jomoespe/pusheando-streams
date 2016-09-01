package com.josemorenoesteban.lab.java.streams.pusheando.simple;

import java.util.Spliterator;
import java.util.Spliterators;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class SimpleStatefullProducer implements Producer<Data> {
    private final int iterations;
    
    public SimpleStatefullProducer(final int iterations) {
        this.iterations = iterations;
    }
    
    @Override
    public Stream<Data> find() {
        return StreamSupport.stream(new Spliterators.AbstractSpliterator<Data>(Long.MAX_VALUE, Spliterator.ORDERED) {
            final AtomicInteger counter = new AtomicInteger(0);
            
            @Override
            public boolean tryAdvance(Consumer<? super Data> action) {
                if (counter.getAndAdd(1) < iterations) {
                    action.accept( new Data( String.valueOf(counter.get()) ) );
                    return true;
                }
                return false;
            }
        }, true);
    }
}
