// break görüldüğü esnada o kod bloğundan çıkar ve o kod bloğunun aşağısındaki kodlar okunmaz
// break sadece içinde bulunduğu kod bloğundan çıkar.

public class break_ {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            if (i == 5) break;
            System.out.print(i + " ");
        }
        System.out.println("\nprogram is over");

        int i = 0;
        while (i < 12){
            if (i == 4){
                i++;
                break;
            }
            i++;
            System.out.println(i);
        }
        UpperLoop:
        while (i < 25){
            int j = 0;
            while (j < 20){
                System.out.println("i = " + i + "  " + "j = " + j);
                j++;
                i++;
                if (i == 8 || j == 3){
                    break UpperLoop;   // upperloop olmasa sadece ilk whileden çıkar.
                } // sadece while (j < 20) döngüsünü bitirir; dışarıdaki
            } // while (i < 25) döngüsü çalışmaya devam eder.
        }
    }
}
