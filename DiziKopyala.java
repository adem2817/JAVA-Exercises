import java.util.Arrays;
import java.util.Random;

public class DiziKopyala {

    public static void main(String[] args) {

        // Rastgele içerikli dizileri kopyalama

        Random rnd = new Random();

        int[] sayilar = new int[5];
        int[] sayilar2 = new int[5];

        for(int i = 0; i < sayilar.length ; i++){
            sayilar[i] = rnd.nextInt(21);
        }

        sayilar2 = Arrays.copyOf(sayilar,sayilar.length);

        for (int a :
                sayilar) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a :
                sayilar2) {
            System.out.print(a + " ");
        }
        System.out.println();

    }
}
