import java.util.Arrays;
import java.util.Random;

public class DiziOrnek {

    public static void main(String[] args) {

        //1 ile 500 arasında rastgele 100 adet tamsayı üretip bir diziye dolduran,
        // dizideki bu sayıların en büyük ve en küçük değerlerini bularak ekrana yazdıran,
        // diziyi sıralayan ve sayıların ortalama değerini hesaplayan programı hazırlıyor olacağız.

        Random rnd = new Random();
        int[] dizi = new int[100];

        int enkck, enbyk, indis1 = 0 ,indis2 = 0;

        //diziyi rastgele doldur
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(501);
        }

        //dizi elemanlarını sırala
        Arrays.sort(dizi);

        //diziyi konsola yazdır
        int sayac = 0;
        for (int a :
                dizi) {
            System.out.print(a + " ");
            sayac++;
            if (sayac % 25 == 0)
                System.out.println();
        }
        System.out.println();

        enbyk = dizi[0];
        enkck = dizi[0];



        //dizinin enbyk ve enkck elemanlarını bul
        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] > enbyk) {
                enbyk = dizi[i];
                indis1 = i;
            }

            if (dizi[i] < enkck) {
                enkck = dizi[i];
                indis2 = i;
            }
        }

        //dizinin ortalaması

        int toplam = 0;
        double ort;
        for (int a :
                dizi) {
            toplam += a;
        }
        ort = (double) toplam / dizi.length; // cast yapmazsak küsürat kısmı sıfır olur
        System.out.println("dizinin ortalaması : " + ort);


        //dizi max ve min ikinci yöntem
        System.out.println("dizinin en byk elemanı : " + dizi[dizi.length-1] + " dizinin enkck elemanı : " + dizi[0]);


        System.out.println("dizinin " + indis1 + ". elemanı olan " + enbyk + " sayısı en büyüktür");
        System.out.println("dizinin " + indis2 + ". elemanı olan " + enkck + " sayısı en küçüktür");


    }
}
