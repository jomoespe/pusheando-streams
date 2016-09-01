package com.josemorenoesteban.lab.java.streams.pusheando.simple;

import java.util.stream.Stream;

public interface Producer<T> {
    Stream<T> find();
}
