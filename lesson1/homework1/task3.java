package lesson1.homework1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        //Реализовать простой калькулятор
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = sc.nextInt();
        System.out.print("Введите знак +-*/: ");
        char op = sc.next().charAt(0);
        System.out.print("Введите второе число: ");
        double num2 = sc.nextInt();
        double ans;
        sc.close();
        switch(op) {
            case '+': ans = num1 + num2;
               break;
            case '-': ans = num1 - num2;
               break;
            case '*': ans = num1 * num2;
               break;
            case '/': ans = num1 / num2;
               break;
            default:  System.out.printf("Error! Enter correct operator");
               return;
               
        }
        System.out.print("\nРезультат\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
    }
}
