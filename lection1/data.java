import java.util.*;
import java.text.*;

public class data {

   public static void main(String args[]) {
      Date dateNow = new Date();
      SimpleDateFormat formatForDateNow = new SimpleDateFormat("'время' hh:mm");

      System.out.println("Текущее " + formatForDateNow.format(dateNow));
   }
}