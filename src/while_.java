public class while_ {
    public static void main(String[] args) {
        int i = 10;
        while (i < 100) {
            i++;
            System.out.print(i + " ");
            i++;
        }
        while (i < 999 && true) {
            i++;
            System.out.println(i + " ");
            i++;
        }
    }
}

/*
for (int i = 0; i < 5; i++) {
    // 1. Parça: Başlangıç (int i = 0)
    // 2. Parça: Şart (i < 5)
    // 3. Parça: Artış/Azalış (i++)

    // işlemler
}
*/


/*
int i = 0; // Başlangıç dışarıda kalır

while (i < 5) { // Sadece ŞART içeride   (başta tanımlamadan int i < 5 falan diyemeyiz. zaten saçma baktığın zaman)
    // İşlemler

    i++; // Artış/Azalış gövde içinde yapılır
}
*/
