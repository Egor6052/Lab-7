package Package;

import java.util.Scanner;

public class Main {
    public static void Task7() {
        System.out.println("Семенов Егор АТ-212, Вариант №7");


        Fraction.setA1(Math.ceil(1 + Math.random() * 10));
        Fraction.setA2(Math.ceil(1 + Math.random() * 10));
        Fraction.setA3(Math.ceil(1 + Math.random() * 10));
        Fraction.setB1(Math.ceil(1 + Math.random() * 10));
        Fraction.setB2(Math.ceil(1 + Math.random() * 10));
        Fraction.setB3(Math.ceil(1 + Math.random() * 10));


        System.out.println(Fraction.R());
        System.out.println(Fraction.R1());
    }
    public static void main(String[] args) {
        Task7();
    }
}
