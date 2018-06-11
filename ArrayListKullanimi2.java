import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayListKullanimi2 {

    public static void main(String[] args) {

        ArrayList<Object> arrList = new ArrayList<Object>();

        for (int i = 0 ; i < 20 ; i++){
            if (i%2 == 0 )
                arrList.add(i);
        }

        System.out.println(arrList);
        //contain
        boolean varMi;
        varMi = arrList.contains(2);
        System.out.print(" var mı : " + varMi);

        System.out.println();


        //clear
        //arrList.clear(); // listeyi tamamen temizler


        //indexOf
        int index;
        index = arrList.indexOf(2);
        System.out.println("index i : " + index);



        //lastIndexOf
        arrList.add(2);
        int index2 = arrList.lastIndexOf(2); // aramaya sondan başlar
        System.out.println("sondan index : " + index2);

        //sublist
        //belirtilen index aralığındaki elemanları başka bir listeye kopyalar. Alt dizi diyebiliriz
        List<Object> liste =  arrList.subList(3,arrList.size());
        System.out.println("yeni liste : " + liste);


        //set
        // o index teki değeri değiştirir
        arrList.set(2,5555);
        System.out.println(" arrlist son hali : " + arrList);
        liste.set(4,123123);
        System.out.println("liste nin son hali : " + liste);


        //sort
        // aynı türden olan listeleri sıralar
        // tür belirtmek şart object olarak kalması kabul edilmiyor
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(34);
        numbers.add(3213);
        numbers.add(123);
        numbers.add(3456);
        numbers.add(87967);
        numbers.add(4534);
        numbers.add(345645);
        numbers.add(767);
        numbers.add(88);
        numbers.add(355);

        System.out.println("sıralamadan önce : " + numbers);

        Collections.sort(numbers);
        System.out.println("sıralamadan sonra : " + numbers);





        //reverse
        //listeyi tersine çevirir. sıralamaz
        //tersten sıralamak için düzden sıraladığımız listeyi tersine çeviririz
        Collections.reverse(numbers);
        System.out.println("sıralanmış listeyi ters çevirdik : " + numbers);



    }

}
