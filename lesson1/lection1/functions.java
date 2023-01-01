public class functions {
    static void sayHi(){
        System.out.println("hi!");
    }
    static int sum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        sayHi();
        System.out.println(sum(1, 3));
    }
}
