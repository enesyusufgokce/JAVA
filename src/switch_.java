import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("switch içinde kontrol edeceğiniz sayıyı girin: ");
        number = scanner.nextInt();

        // case nin içine if falan yazabiliriz

        System.out.println("number 2");
        int number2 = scanner.nextInt();

        switch (number){
            // not: if else daha esnektir
            case 100:   // iki nokta var dikkat
                System.out.println("yes 100");
                break;  // break koymasak switc in içinden çıkmaz, aşağıdaki caselerin de içine girer
            case 200:  // ilk değer 200 ise girecek
                if (number2 > 100) {  // ikinci deper 100 den büyükse
                    System.out.println("number2 is greater than 100");
                }
                System.out.println("yes 200");
                break;
            case 300:
                System.out.println("yes 300");
                break;
            default:   // else ye tekabül ediyo. defaultta break e gerek yok. yazıp yazmamak önemli değildir
                System.out.println("the number neither 100 nor 200 nor 300, your number is: " + number);
        }

        System.out.print("switch içinde kontrol edeceğiniz ismi girin: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        switch (name){
            case "yusuf":
                System.out.println("name is yusuf");
                break;
            case "gökçe":
                System.out.println("name is gökçe");
                break;
            case "enes":
                System.out.println("name is enes");
                break;
            default:
                System.out.println("name is " + name);
        }
        System.out.println("the program has finished");
    }
}
