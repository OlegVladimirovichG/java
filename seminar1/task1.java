package seminar1;

import java.util.Scanner;
import java.time.LocalTime;
/* в консоли запросите имя пользователя. в зависимости от времени суток вывести:
 * доброе утро, если время от 5 до 11:59
 * добрыый день от 12 до 17:59
 * добрый вечер от 18 до 22:29
 * доброй ночи от 23 до 4:59
 */
public class task1 {
    public static void main(String[] args) {
        LocalTime lt = LocalTime.now();
        int hour = lt.getHour();

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ваше имя: ");
        String name = sc.nextLine();
        
        if (5 <= hour && hour < 12){
            System.out.printf("доброе утро, %s", name);
        } else if (12 <= hour && hour < 18 ){
            System.out.printf("добрый день, %s", name);
        } else if (18 <= hour && hour < 23 ){
            System.out.printf("добрый вечер, %s", name);
        } else {
            System.out.printf("доброй ночи, %s", name);
        }
        sc.close();  
    }
}
