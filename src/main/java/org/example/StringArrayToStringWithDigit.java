package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Task3
 */
public class StringArrayToStringWithDigit {
    private final String[] inputStringsArray;

    public StringArrayToStringWithDigit(String[] inputStringsArray) {
               this.inputStringsArray = inputStringsArray;
    }

    public String tranform() {
        String result = Arrays.stream(inputStringsArray) // string array to strings stream
                .flatMap((s)->Arrays.stream(s.split(", "))) // get string from stream, split to new string array {"1","2","0"}
                .map(Integer::valueOf) // convert every element to int
                .sorted() // sort array of Integer in natural order
                .map(String::valueOf) // convert every Integer to string
                .collect(Collectors.joining(", ")); // join string elements of stream with ", " delimiter
        return result; //return result string
    }


}


