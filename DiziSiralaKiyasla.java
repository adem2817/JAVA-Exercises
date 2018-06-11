import java.util.Arrays;
import java.util.Random;

public class DiziSiralaKiyasla {


    public static void main(String[] args) {

        //rastgele üretilen iki diziyi birbiriyle kıyaslayan program

        Random rnd = new Random();

        int[] dizi1 = new int[5];
        int[] dizi2 = new int[5];

        //dizi1 i doldur
        for (int i = 0 ; i < dizi1.length ; i++  ){
            dizi1[i] = rnd.nextInt(21);
        }
        //dizi2 yi doldur
        for (int i = 0; i < dizi2.length ; i++){
            dizi2[i] =  rnd.nextInt(21);
        }

        //dizileri yazdır

        System.out.println("sıralamadan önceki hali ");
        for (int a : dizi1) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a :
                dizi2) {
            System.out.print(a + " ");
        }
        System.out.println();


        //dizileri sırala
        Arrays.sort(dizi1);
        Arrays.sort(dizi2);

        //dizileri yazdır
        System.out.println("sıralamadan sonraki hali ");

        for (int a :
                dizi1) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a :
                dizi2) {
            System.out.print(a + " ");
        }
        System.out.println();

        // diziler birbirine eşit mi ?
        String isEqual = (Arrays.equals(dizi1,dizi2)) ? "Diziler birbirine eşit" : "Diziler eşit değiller";
        System.out.println(isEqual);
    }
}
