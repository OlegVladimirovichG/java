import java.util.Scanner;
import java.util.Random;
/*
Задана натуральная степень k. Сформировать случайным образом список коэффициентов 
(значения от 0 до 100) многочлена многочлен степени k. 
Пример: k=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 или 10*x² = 0 */


public class homeWork {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите коэффециент k: ");
        int k = iScanner.nextInt();
        Random random = new Random(1);
        int rand_int1 = random.nextInt(100);
        for (int i = 0; i < args.length; i++) {
            
        }
        System.out.println(k);
        System.out.println(rand_int1);
        iScanner.close();
    }
}

