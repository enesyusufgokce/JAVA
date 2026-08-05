public class Arrays3 {
    public static void main(String[] args) {
        int[][][] myArr = new int[2][][];  // 0. index e sayı yazmak zorundayız

        myArr[0] = new int[2][];   // dinamik olarak ayarlamak istersek. istemiyosak new int[2][4] gibi deriz
        myArr[0][0] = new int[3];
        myArr[0][1] = new int[3];
        myArr[1] = new int[3][];
        int number1 = myArr[0][1][2] = 8;
        // int number2 = myArr[1][2][3] = 7;  // myArr[1]'e git. (Burası boş/null). çünkü tanımlamadık
        // Boş olan bir şeyin 2. indeksine erişmeye çalış.Olmayan bir şeyin (null) içindeki indekse bakamazsın"
        // diyerek NullPointerException fırlatır.
        myArr[1][2] = new int[2];
        myArr[1][2][1] = 4;
        System.out.println(myArr[1][2][1]);

        // Java'da {1} şeklindeki kısa yazımı (initializer list) sadece diziyi ilk kez tanımlarken
        // kullanabilirsin. Sonradan değer atamak için bu yöntemi doğrudan kullanamazsın

        // myArr [1][2] = {1,2,3}; şeklindeki kullanım sadece initialize ederken kullanılır
        myArr [1][2] = new int[] {2,1,2,3};
        // Hafızada 4 elemanlı yepyeni bir dizi oluşturdu.
        //myArr[1][2] referansını (adresini), o eski 2 kişilik diziden koparıp bu yeni 4 kişilik diziye bağladı.
        int[][][] yourarray1 = {{{3}, {3}}, {{6}, {6}}};
        int[][][] yourarray2 = new int[][][] {{{3}, {3}}, {{6}, {6}}}; // methoda dizi gönderirken falan bu format
        // aynı anda hem boyut belirtip hem de içine süslü parantezle değer atayamazsın
        myArr = new int[][][] {{{1,2,3,4}, {7,8,9}, {11,12,13}},{{43}, {44}, {45, 55}}}; // güncelledik önceki array ı
        // Eğer ikinci katmana sadece 43 sayısını koymak istiyorsan, onun etrafına katmanına
        // uygun kadar süslü parantez eklemelisin: {{43}} olarak
        System.out.println(myArr[0][0][2]);
        System.out.println(myArr[1][2][1]);

        System.out.println("-----");

        for (int i = 0; i < myArr.length; i++){
            for (int j = 0; j < myArr[i].length; j++){
                for (int k = 0; k < myArr[i][j].length; k++){
                    System.out.println(myArr[i][j][k]);
                }
            }
        }
    }
}

/*

1. Kural: "New" Demediysen O Yer Yoktur (Null)
Bir dizinin alt boyutlarına ([0][1] gibi) erişmeden önce, o katmanı mutlaka new ile oluşturmalısın.
Eğer yapmazsan Java "burası boş" der ve NullPointerException fırlatır.
int[][] dizi = new int[2][]; → Dış kutu var ama içindekiler null.

dizi[0] = new int[3]; → Artık 0. katın içinde 3 tane oda var.

2. Kural: Boyut Sabit Değildir, Referans Değişebilir
Daha önce new int[2] dediğin bir yere, daha sonra new int[10] atayabilirsin. Java eski (küçük) diziyi çöpe atar,
 yerine yeni (büyük) diziyi bağlar. Bu bir "kapasite aşımı" değil, "eşyayı yenisiyle değiştirmek"tir.

3. Kısa Yazım (Sadece İlk Tanımlamada)
Bir değişkeni ilk kez oluştururken Java çok zekidir. Sen tipi belirttiğin için yanına sadece süslü parantez
koymanı kabul eder.

// Java der ki: "Tipi int[] olarak belirttin, o yüzden sağdaki { } kesinlikle int dizisidir."
int[] dizi = {1, 2, 3}; // TAMAM ✅
Uzun Yazım (new ile olan)
Değişkeni daha önceden oluşturduysan veya başka bir yere (mesela bir metodun içine) gönderiyorsan, Java o süslü
parantezin ne olduğunu anlayamaz. Bu yüzden "bu yeni bir int dizisidir" diye açıkça (new int[]) belirtmen gerekir.

int[] dizi; // Önce tanımladık
// dizi = {4, 5, 6}; // HATA! ❌ Java der ki: "Bu süslü parantez ne? String mi, int mi, belli değil."
dizi = new int[] {4, 5, 6}; // TAMAM ✅ "Bak bu yeni bir int dizisidir" dedik.

*/