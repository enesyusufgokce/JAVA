public class Arrays2 {
    public static void main(String[] args) {

        String name = "Yusuf";  // note: stringler bir char dizisidir
        char[] charArray = {'Y', 'u', 's', 'u', 'f'};

        for (int i = 0; i < charArray.length; i++){
            System.out.print(charArray[i]);
        }
    }

    // Multiimensional arrays
    static class MultiDarrays{
        public static void main(String[] args) {

            int[][] intArray = new int[2][3];
            System.out.println(intArray.length);
            System.out.println(intArray[1].length);

            // assign 1,2 and 3 to the 0'th inxed of the array
            // assign 10, 20, 30 to the 1'th index of the array
            intArray[0][0] = 1;
            intArray[0][1] = 2;
            intArray[0][2] = 3;

            intArray[1][0] = 10;
            intArray[1][1] = 20;
            intArray[1][2] = 30;

            System.out.println("-----------");

            for (int i = 0; i < intArray.length; i++){
                for (int j = 0; j < intArray[i].length; j++){ // intArray'in içinde indexlediğimiz arrayın uzunluğu kadar dönecek
                    System.out.println(intArray[i][j]);
                }
            }
        }
    }

    // int[][] array = new int[2][4]; // Başta ikisi de 4'erli
    // array[1] = new int[2]; // İkinci satırı çöpe atıp yerine 2 elemanlı yeni bir dizi koyduk!
    // Bu işlemden sonra array[0] hala 4 elemanlıyken, array[1] artık 2 elemanlı olur. Yani Java'da diziler
    // aslında birer nesne referansı olduğu için, satırları sonradan tamamen farklı boyuttaki
    // dizilerle "yer değiştirebilirsin".
    // Ama en baştan [2][4] yazarsan, sen müdahale edene kadar hepsi 4 olarak kalmak zorundadır.

    // Eğer satırların uzunluklarının ne olacağını henüz bilmiyorsan veya her satırın keyfine göre
    // takılmasını istiyorsan, o ikinci parantezi boş bırakmalısın:
    //int[][] ozgurArray = new int[2][];

    static class MultiDarrays2{
        public static void main(String[] args) {

            int[][] yusuf = new int [3][];  // 1. boyutu 3 elemanlı olcak ama 2. boyutlar için bir kısıtlama yok
            yusuf[0] = new int[3];
            yusuf[1] = new int[4];
            System.out.println(yusuf.length);
            System.out.println(yusuf[0].length);
            System.out.println(yusuf[1].length);

            yusuf[2] = new int[5];
            yusuf[0][0] = 1;
            yusuf[2][4] = 10;
            System.out.println(yusuf[2].length);
            System.out.println(yusuf[0][0]);
            System.out.println(yusuf[0][0]);  // bu artık doğrudan bir sayı olduğu için yusuf[0][0].length diyemedik

            System.out.println("-------");

            for (int i = 0; i < yusuf.length; i++){
                for (int j = 0; j < yusuf[i].length; j++){
                    System.out.print(yusuf[i][j] + " ");
                }
            }
        // Java'da sol tarafta değişkeni tanımlarken (declaration) köşeli parantezlerin içine rakam yazamazsın.
        // Boyut, ya new anahtar kelimesiyle ya da süslü parantez içindeki eleman sayısıyla belirlenir.
        // int[3][3] gokce = {{1,2,3}, {4,5,6}, {7,8,9}};  yaptığım bir hata

            System.out.println();
            System.out.println("-----");

            int[][] gokce = {{1,2,3}, {4,5,6}};
            for (int i = 0; i < gokce.length; i++){
                for (int j = 0; j < gokce[i].length; j++){
                    System.out.println(gokce[i][j]);
                }
            }
        }
    }
}
