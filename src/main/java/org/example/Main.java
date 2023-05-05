package org.example;

import java.util.List;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        //Task1
        List<String> names = List.of("Ivan", "Maria", "Peter", "Olga","Alina","Tonny","Tatty", "John","Daniel");
        System.out.println((new nameFilterByIndex()).filterNames(names)); // 1. Ivan, 3. Peter


        //Task2
        List<String> input = List.of("foo", "bar", "baz","boo", "jar", "jazz");
        System.out.println((new toUppercaseAndSort(input)).transform());

        //Task3
        String[] stringArray = {"1, 2, 0", "4, 5"};
        System.out.println((new StringArrayToStringWithDigit( stringArray)).tranform());

        //Task4
        new RandomLongGenerator(25214903917L, 11L,(long) Math.pow(2, 48), 12345L)
                .generate()
                .limit(10)
                .forEach(System.out::println);

        //Task5
        Stream<String> words = Stream.of("This guide teaches you how to work with Java 8 streams".split("\\s+"));
        Stream<String> indexes = Stream.of("1","2","3","4","5","6","7","8");
        (new StreamMixer()).mix(words,indexes).forEach(System.out::println);

    }
}