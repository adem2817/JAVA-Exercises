import java.util.Scanner;

public class GirilenMetniTerstenYazdir {

    public static void main(String[] args) {


        System.out.print("metin giriniz : ");
        Scanner scn = new Scanner(System.in);
        String metin = scn.nextLine();

        String metin2="";

        int boyut = metin.length()-1;

        for(int i = metin.length()-1 ; i >= 0 ; i-- ){
            metin2 += metin.charAt(i);
        }
        System.out.println(metin2);

    }
}
