// Döngü içerisinde continue satırına gelindiğinde, altındaki kodlar çalıştırılmaz;
// program hemen döngü başına döner (bulunduğu kod bloğunun başına) ve kontrol ifadesini (veya artırma işlemini)
// kontrol ederek bir sonraki turdan devam eder.

public class continue_ {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.print(i);
            if (i == 5){
                continue;
            }
            System.out.println(" " + i);
        }
        System.out.println("program is over");

        int i = 0;
        while (i < 10){
            if (i == 5){
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
