public class for_ {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i= i + 3){   // başta verdiğimiz sayıyı da yazar unutma (i = 0)
            System.out.println(i);  // kontrol eder, şart sağlanırsa yazar, artırır, kontrol eder şart sağlanırsa tekrar yazar
        }

        System.out.println("----------------------------------");

        for (int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        for (int i = 0, j = 10, k = 30; i < 5 && j < 20; i++, j+=5){
            System.out.print("i = " + i);
            System.out.print("   j = " + j);
            System.out.print("   k = " + k);
            System.out.println();
        }
    }// 0  10  30, 1  15  30
}

// pre / post increment for içinde ++i ya da i++ durumunu etkilemez çünkü
// Döngünün güncelleme kısmına gelindiğinde, i değişkeni o satırda tek başınadır.
// Yani "önce azalt sonra ata" veya "önce ata sonra azalt" demen sonucu değiştirmez;
// çünkü o değer bir sonraki "Koşul Kontrolü" adımına gidene kadar zaten her iki durumda da azalmış olur.

// ex: (i = 10)
// Post-decrement (i--) Önce kullan, sonra azalt  int a = i--; → a = 10, i = 9
// Pre-decrement (--i) Önce azalt, sonra kullan  int a = --i; → a = 9, i = 9
