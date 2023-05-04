package org.example;

import java.util.stream.Stream;

public class RandomLongGenerator {
    private long a;
    private long c;
    private long m;
    private long seed;
    public RandomLongGenerator(long a, long c, long m, long seed) {
        this.a = a;
        this.c = c;
        this.m = m;
        this.seed = seed;
    }

    public Stream<Long> generate() {
            return Stream.iterate(seed, x -> (a * x + c) % m);
    }


}


