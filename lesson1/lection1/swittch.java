import java.util.Scanner;
public class swittch {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число от 1 до 12: ");
        int value = iScanner.nextInt();
        int mounth = value;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
    }
}