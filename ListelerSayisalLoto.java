import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ListelerSayisalLoto {

    public static void main(String[] args) {
        //Java ile 1-49 arasında 6 adet Rastgele Sayı Üreten Sayısal Loto Programı


        ArrayList<Integer> sayilar = new ArrayList<Integer>();
        Random rnd = new Random();

        int sayac = 0,sayi;

        while (sayac < 6) {
            sayi = rnd.nextInt(49) + 1;
            if (sayilar.indexOf(sayi) == -1) {
                sayilar.add(sayi);
                sayac++;
            }
        }
        Collections.sort(sayilar);
        System.out.println("sonuclar : " + sayilar);
    }
}
