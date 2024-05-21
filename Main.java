import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
        print();
        evenNumber();


    }

    private static int input() {
        return new Scanner(System.in).nextInt();
    }

    private static void evenNumber() {
        if (input() % 2 == 0) {
            System.out.println("True");
        } else System.out.println("False");
    }

    private static void print() {
        System.out.println("Введите число: ");

    }
}
