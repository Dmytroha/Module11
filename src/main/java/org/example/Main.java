package org.example;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<String> names = List.of("Ivan", "Maria", "Peter", "Olga","Alina","Tonny","Tatty", "John","Daniel");
        System.out.println((new nameFilterByIndex()).filterNames(names)); // 1. Ivan, 3. Peter


        List<String> input = List.of("foo", "bar", "baz","boo", "jar", "jazz");
        System.out.println((new toUppercaseAndSort(input)).transform());


    }
}