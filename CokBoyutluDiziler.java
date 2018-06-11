public class CokBoyutluDiziler {

    public static void main(String[] args) {
        //dizileri doldur

        int[][] diziC = new int[5][6];

        diziC[3][4] = 5;
        diziC[4][2] = 3;
        diziC[2][1] = 1;
        diziC[0][5] = 8;


        //for ile konsola yazdır

        for (int i = 0; i < diziC.length ; i++){
            for (int j = 0 ; j < diziC[i].length; j++){
                System.out.print(diziC[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        //foreach ile konsola yazdır
        for (int dizi[]:
                diziC) {
            for (int a :
                    dizi) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();

        //initial value ile doldur

        int[][] mDizi = new int[][]{
                {5,23,23,453,2},
                {1},
                {0,6,4,7,9,0,5,3,6,9},
                {555,33,88}
        };


        for (int dizi[] :
                mDizi) {
            for (int a :
                    dizi) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println();
        // satır sayısı sabit sütun sayısı değişken dizi tanımla


        int[][] mDizi_ = new int[5][];
        mDizi_[0] = new int[4];
        mDizi_[1] = new int[3];
        mDizi_[2] = new int[2];
        mDizi_[3] = new int[3];
        mDizi_[4] = new int[2];


        for (int i = 0; i < mDizi_.length; i++){
            for (int j = 0; j<mDizi_[i].length; j++){
               mDizi_[i][j] = i+j;
            }
        }

        for (int dizi[] :
                mDizi_) {
            for (int a :
                    dizi) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        System.out.println();
    }



}
