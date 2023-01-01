package lesson1.seminar1;

public class task4 {
    public static void main(String[] args) {
        String[] str = {"String", "Strin", "Str", "Stri", "Star", "S"};
        String prefix = str[0];
        for (int i = 1; i < str.length; i++) {
            while (!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }System.out.println(prefix);
    }
}
