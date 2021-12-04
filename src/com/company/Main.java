package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println(weatherAge(generateRandomAge(),25));
        System.out.println(weatherAge(generateRandomAge(),35));
        System.out.println(weatherAge(generateRandomAge(),10));
        System.out.println(weatherAge(generateRandomAge(),15));
        System.out.println(weatherAge(generateRandomAge(),5));

    }
    public static String weatherAge(int age, int temp) {
        if (age > 20 && age < 40 && temp > -20 && temp < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temp > 0 && temp < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temp < -10 && temp > 25){
            return "Можно идти гулять";
        }else {
            return "Остовайте дома";
        }
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int a = random.nextInt();
        return a;
    }
}
