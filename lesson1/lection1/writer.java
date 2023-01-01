import java.io.FileWriter;

public class writer {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("file.txt", true)){ //true - дозапись, false - новый файл
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

}