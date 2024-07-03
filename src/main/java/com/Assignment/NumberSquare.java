package com.Assignment;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberSquare {

        public static void main(String[] args) {
            List<Integer> numbers = Arrays.asList(10,20,30,40,50,100);

            List<Integer> squaredNumbers = numbers.stream()
                    .map(number -> number * number)
                    .collect(Collectors.toList());

            System.out.println("Squared Numbers: " + squaredNumbers);
        }
    }




