package org.example;

import java.util.List;


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



    }
}