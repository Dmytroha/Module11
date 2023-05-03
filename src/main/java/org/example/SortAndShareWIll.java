package org.example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndShareWIll {

        public static void main(String[] args) {
            String[] arr = {"1, 2, 0", "4, 5"};

            String result = Arrays.stream(arr) // преобразуем массив в поток строк
                    .flatMap(s -> Arrays.stream(s.split(", "))) // преобразуем каждую строку в поток чисел, разделенных запятой
                    .map(Integer::valueOf) // преобразуем каждую строку в число
                    .sorted() // сортируем числа по возрастанию
                    .map(String::valueOf) // преобразуем каждое число в строку
                    .collect(Collectors.joining(", ")); // соединяем числа в одну строку, разделенную запятой и пробелом

            System.out.println(result); // выводим результат на экран
        }

}


