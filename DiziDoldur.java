import java.util.Arrays;
import java.util.Random;

public class DiziDoldur {

    public static void main(String[] args) {


        int[] dizi = new int[10];

        Random rnd = new Random();

        for (int i = 0; i < dizi.length ; i++){
            dizi[i] = rnd.nextInt();
        }

        //dizi elemanlarına sıfır ata
        Arrays.fill(dizi,0);

        for (int a :
                dizi) {
            System.out.print(a + " ");
        }
        System.out.println();

        //2-4 elemanlarını 5 ile dolduu
        Arrays.fill(dizi,2,4,5);

        System.out.println("değiştirildikten sonra");
        for (int a :
                dizi) {
            System.out.print(a + " ");
        }
    }

}
