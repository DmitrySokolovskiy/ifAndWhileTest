package by.it.academia.main;

import java.util.Random;

public class IfWhile {
    public static void main(String[] args) {
        IfWhile mn = new IfWhile();

        int generValue = mn.generator();

        System.out.println("Ваше значение: " + generValue);
        System.out.println(mn.checker(generValue));
        System.out.println("Ваше чётное значение: " + mn.evenGenerator());
    }

    public String checker(int x) {
        if (x < 50) {
            return "Введенное число меньше 50";
        } else {
            return "Введенное число больше или равно 50";
        }
    }

    public int generator() {
        Random rnd = new Random();
        int x = rnd.nextInt(100);

        return x;
    }

    public int evenGenerator() {
        IfWhile gn = new IfWhile();

        int evenNumb = gn.generator();
        while (evenNumb % 2 != 0) {
            evenNumb = gn.generator();
        }
        return evenNumb;
    }

}
