package by.mjc.api;

import by.mjc.core.Utils;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] numbers = {"12", "79"};
        if (Utils.isAllPositiveNumbers(numbers)) {
            System.out.println(Arrays.toString(numbers) + " is Positive Numbers");
        } else {
            System.out.println(Arrays.toString(numbers) + " isn't Positive Numbers");
        }
    }
}
