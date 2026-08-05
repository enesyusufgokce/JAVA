// iş mantıklarını nethod halinde yazarız

public class Methods1 {
    public static void main(String[] args) {
        sayHello("yusuf", "gökçe");
        sayHello("raymond", "reddington");

        addition(30, 40);
        addition(20, 454);
        startClass();
        int result_of_add = add(4, 7, "Yusuf");
        System.out.println(result_of_add + "ss");

        int result_of_add2 = add2(1,2,3,4,5,6);
        System.out.println(result_of_add2);
    }

     static void sayHello(String name, String surname){

        System.out.println("Hello " + name + " " + surname);

    }
    // void, because returns nothing. just does addition and prints the result to the screen
    static void addition(int a, int b){
        System.out.println(a + b);
    }
    static void startClass(){
        System.out.println("files are read!!!");
        System.out.println("configuration is done!!!");
    }
    // return a value
    static int add (int num1, int num2, String name){
        System.out.println("Hello: " + name);
        int result = num1 + num2;
        return result;
    }
    static int add2 (int... numbers){  // debug modundan bakarsan numbers, array olarak gelir.
                                       // not: bu var_Args, en sonda olmalı eğer başka parametre de yazıyorsan
        int addition = 0;
        for (int i = 0; i < numbers.length; i++){
            addition += numbers[i];
        }
        return addition;
    }
}

// Static: Methodun bir nesneye değil, doğrudan sınıfa ait olduğunu belirtir
// Non-static metotlar çalışmak için mutlaka bir object'e ihtiyaç duyar
// (static methodun içinde o yüzden "new" leyerek object oluşturuyoruz)
// Ama non-static bir methoddan nonstatic i çağırmak istiyosak zaten o methodu
// kullanırken bir object oluşturmuş olacağımız için diğer non-static methodu zaten o nesne üzerinden
// kullanabiliriz

// Static Method: Program başlar başlamaz bellekte zaten hazırdır. Adresi bellidir.
// static method için new diyip object oluşturmana gerek kalmaz; Java o adresi zaten biliyordur.
// analizEt()

// Ama non-static bir method bellekte hazır değildir. Object ile kullanabilirsin
// Mutfak benimMutfagim = new Mutfak();
// benimMutfagim.musluguAc();  (musluguAc is a non-static method) - static bir methodun içinde çağırıyoz diyelim

// static, non-static, void, return
