import java.util.ArrayList;

public class ArrayListKullanimi {

    public static void main(String[] args) {
        ArrayList<Object> kisiBilgileri = new ArrayList<Object>();
        kisiBilgileri.add(25);
        kisiBilgileri.add("Adem");
        kisiBilgileri.add("Bilgisayar Mühendisliği");
        kisiBilgileri.add(true);
        kisiBilgileri.add("İstanbul");


        kisiBilgileri.remove(0); // ilk elemanı siler
        kisiBilgileri.remove(kisiBilgileri.size()-1); // son elemanı siler
        kisiBilgileri.remove("Adem"); //girilen object i siler yoksa hata vermez
        System.out.println(kisiBilgileri); // tek satırda köşegenler içinde ekrana yazdırır değişkenleri kullandırmaz

        kisiBilgileri.add(1,"yılmaz");
        kisiBilgileri.add(3,"istanbul");
        kisiBilgileri.add(0,1);
        //girilen index e yerleştirir (araya yerleştirme)


        //ekrana yazdırma
        for (int i= 0 ; i < kisiBilgileri.size(); i++ ){
            System.out.print(kisiBilgileri.get(i) + " ");
        }
        System.out.println();

        //foreach ile yazımı
        for (Object a :
                kisiBilgileri) {
            System.out.print(a + " ");
        }
        System.out.println();


        ArrayList<String> isimler = new ArrayList<String>();
        isimler.add("adem");
        isimler.add("KBU");
        isimler.add("İstanbul");

        for (int i = 0; i<isimler.size();i++){
            System.out.print(isimler.get(i) + " ");
        }
        System.out.println();

        ArrayList deneme = new ArrayList<>(); // bu şekildede tanımlama yapılabilir pek tavsiye edilmez
        //türü object tir
        deneme.add(true);


        //0-50 arasında 3 e tam bölünenleri arraylist e ekleyip konsola yazdır

        ArrayList<Object> sayilar = new ArrayList<Object>();
        for (int i = 0; i<50;i++){
            if (i%3 == 0)
                sayilar.add(i);
        }
        for (Object a :
                sayilar) {
            System.out.print(a + " ");
        }
        System.out.println();



    }
}
