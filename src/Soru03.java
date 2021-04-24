import java.util.Locale;
import java.util.Scanner;

public class Soru03 {
    public static void main(String[] args){

     //Girilen String'i büyük harfe çeviren programı yazınız.

     Scanner scan = new Scanner(System.in);
     System.out.println("String giriniz");
     String kelime=scan.next();

     System.out.println(kelime.toUpperCase());

    }
}
