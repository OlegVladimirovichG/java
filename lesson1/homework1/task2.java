package lesson1.homework1;

public class task2 {
    public static void main(String[] args) {
        /*Вывести все простые числа от 1 до 100*/
        //int[] natural = {};
        for(int i = 2; i < 100; ++i){
            int count = 0;
            for(int j = 2; j <=i && count < 2;++j){
              if(i%j==0){
                ++count;
              }
            }
            if(count<2)
               System.out.println(i);
        }
    }
}