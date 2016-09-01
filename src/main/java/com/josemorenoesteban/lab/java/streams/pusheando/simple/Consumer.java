package com.josemorenoesteban.lab.java.streams.pusheando.simple;

public class Consumer {
    
    public static void main(String...args) {
        Producer producer = new SimpleStatefullProducer( 10 );
        producer.find()
            .forEach( System.out::println );
    }
}
