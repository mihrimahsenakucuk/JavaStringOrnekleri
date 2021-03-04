
public class Soru04 {
    //Verilen cümleyi tersten yazdıran programı giriniz.

    public static void main(String[] args) {

        String cumle="Java programlama dilidir ";
        String reverse= cumle.substring(16)+cumle.substring(5,17)+cumle.substring(0,4);

        System.out.println(reverse);


    }

}