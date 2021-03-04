import java.util.Scanner;

public class Soru01 {
    public static void main(String[] args){

        /*Kullanıcıdan kelime girmesini isteyiniz. Kelimenin uzunluğu  3'den büyük ve
          rakamları uzunlugu tek ise TEK
          rakamları uzunlugu çift ise ÇİFT yazdırın.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Kelimenizi giriniz.");
        String kelime= scan.next();

        if(kelime.length() % 2 ==0 && kelime.length()<=3){
            System.out.println("ÇİFT");
        }else{
            System.out.println("TEK");
        }

    }

}
