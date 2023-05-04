package org.example;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Task2
 */

public class toUppercaseAndSort {
    private List<String> input;

    public toUppercaseAndSort(List<String> input) {
        this.input=input;
    }

    public List<String> transform(){
        //List<String> output = ;
               return input.stream()
                .map(String::toUpperCase)
                .sorted((s1, s2) -> s2.compareTo(s1))
                .collect(Collectors.toList());
    }

}
