import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args){

        /*Kullanıcıdan iki kelime girmesini isteyin.
          Girilen ilk kelimenin uzunluğu 2'ye bölüyorsa işleme devam edin.
          İlk kelimenin yarısını alıp ikinci kelimeyi ilk kelimenin ortasınına koyan programı yazınız.
        */

      Scanner scan= new Scanner(System.in);
      System.out.println("İlk kelimeyi giriniz");
      String kelime1=scan.next();

      System.out.println("İkinci kelimeyi giriniz");
      String kelime2=scan.next();

      boolean dogru=kelime1.length() % 2 == 0;

      String kelimeilkyarisi= kelime1.substring(0, kelime1.length() / 2);
      String kelimeikinciyarisi= kelime1.substring(kelime1.length() / 2);

      if(dogru){
          System.out.println(kelimeilkyarisi.concat(kelime2).concat(kelimeikinciyarisi));
      }






    }
}
