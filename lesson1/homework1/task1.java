package lesson1.homework1;

import java.util.Scanner;

public class task1 {
    public static void main (String[] args) {
        /*Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n) */
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int n = 0;
        int f = 1;
        for (int i = 1; i < num + 1; i++) {
            f = f * i;
            n = n + i;
        }
        System.out.println(f);
        System.out.println(n);
        sc.close();
    }
}
