import java.util.Scanner;

public class test {

    public static void main(String[] args){
        int i =0;
        String stars = "******";
        String pluses = "++++++";
        while (i< 4)
        {      System.out.print(pluses.substring(0,i));
               System.out.println(stars.substring(i, 4));
              i++;
        }

    }
}
