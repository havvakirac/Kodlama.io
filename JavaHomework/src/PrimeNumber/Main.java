package PrimeNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = 31;
        boolean isPrime = true;

        if (num < 2) {
            System.out.println("Geçersiz sayı");
            return;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(num + " Sayısı asaldır");

        } else
            System.out.println(num + " Sayısı asal değildir!");

    }
}
