import java.util.Scanner;

public class stringpool_if_vs_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name1 = new String("yusuf");
        String name2 = new String("yusuf");
        System.out.println(name1 == name2);
        // Değişken   Bellek Adresi   İçerik
        //  name1	      0x101	      "yusuf"
        //  name2	      0x202	      "yusuf"
        // her new dediğimizde memoryde yeni bir adres allocate edilir
        // yani referans şekilde atadığımızda hepsi ayrı ayrı oluşur

        // String name = "yusuf";   dediğimizde string pool a atama yapıyor
        String namee = "yusuf";
        System.out.println(namee == "yusuf");
        String nameee = "yusuf";
        System.out.println(namee == nameee); // namee ve nameee variables string poolda aynı adresi gösteriyo
                                              // string poolda aynı değer sadece bir kere oluşur çünkü
        System.out.print("enter your name: ");
        String name = scanner.nextLine();

        /*
        switch (name) {
            case "yusuf":                         // name "yusuf" ve hi yusuf dedi
                System.out.println("hi yusuf");
                break;
            case "gökçe":
                System.out.println("hi gökçe");
                break;
            case "aysu":
                System.out.println("hi aysu");
                break;
            default:
                System.out.println("your name will be kemal");
        }
        */


        if (name  == "yusuf"){         // isim yusuf olmasına rağmen elseyi döndürdü
            System.out.println("hi yusuf");  // == ifadesi ram adresleri eşit mi diye bakar çünkü
        }                           // pool a atadığımız stringler ve objectler (scanner objesi burda) ram de
        else if (name == "gökçe"){  // farklı adreslerde çünkü
            System.out.println("hi gökçe");
        }
        else if (name == "aysu"){
            System.out.println("hi aysu");
        }
        else{
            System.out.println("your name will be kemal");
        }
    }
}
/*
Java derleyicisi (compiler), switch bloğunu çalıştırırken senin yerine gizlice .equals() metodunu kullanır.
yani sen case "yusuf": yazdığında, Java aslında arka planda name.equals("yusuf") kontrolü yapar.
İçerik Kontrolü: .equals() metodu adreslere bakmaz, sadece içindeki harflerin sırasına ve değerine bakar.
"yusuf" ile "yusuf" içerik olarak aynı olduğu için switch bunu doğru kabul eder.
*/