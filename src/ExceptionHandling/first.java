// try, catch, throw, throws
// yukarıdan aşağıya doğru okunur. yukarıda yakalanıyosa aşağıdakine girmeden çıkar
package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class first {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // try -> dene, denerken hata çıkarsa catch -> yakala
        try {
            int number1 = scanner.nextInt(); // number1, scanner in klavyeden okuyup da döndürdüğü tamsayıdır
            int number2 = scanner.nextInt(); // scanner.nextInt(); klavyeden girdiğin sayıyı döndürür.
            System.out.println(number1 / number2);
        } catch (ArithmeticException e) {
            System.out.println(e); // kullanıcı hatalı aritmetik işlem yapmaya kalkarsa (/0 gibi) burdan fırlatır
            System.out.println("hop kardeş sakin");
        } catch (InputMismatchException e) {  // alt alta birden çok catch yazılabilir
            System.out.println(e);  // kullanıcı harf yazarsa burdan fırlatır
            System.out.println("geçerli sayı gir");
            // Yani Java sırayla catch'leri "denemiyor". Exception fırlatıldığı an tipi belli;
            // Java sadece o tiple eşleşen catch'i seçiyor.
        }
        /*
        InputMismatchException hatası scanner.nextInt() çağrısında, yani try bloğuna girmeden önce
        fırlatılıyor. Sen "a" gibi bir şey yazdığında program daha try'a varamadan patlıyor.
        Bu yüzden catch onu yakalayamıyor.

        o yüzden number1 ve number2 yi try ın içine alıyoz

        catch (InputMismatchException I) {  // alt alta birden fazla catch yazabiliriz
        System.out.println(I);
        System.out.println("input is mismatched");
        }
        */

        System.out.println("end of program");
        // 0 a böldüğümüzde error olacak yerde hatayı fırlattı ve kaldığı yerden devam etti. kesintiye uğramadı

        // her hata için aynı yönlendirmeyi yapmak istersek (yukardakinde her biri için ayrı yönlendiriyoduk)
        // catch (ArithmeticException | InputMismatchException e){} diyebiliriz, ya da her ikisi birer
        // RuntimeException olduğu için direkt catch(RuntimeException e){} de diyebiliriz.

        // yukarıya RuntimeException ile catch yapıp altta InputMismatchException ile catch yapamayız
        // çünkü yukarıda zaten daha kapsayıcısı sayesinde yakalanmış oluyor.

        // tam tersini yazarsak inputmismatch de yukarıdakine, kalan numtimelerde Runtimeexception a girer.

        try {
            int number1 = scanner.nextInt(); // number1, scanner in klavyeden okuyup da döndürdüğü tamsayıdır
            int number2 = scanner.nextInt(); // scanner.nextInt(); klavyeden girdiğin sayıyı döndürür.
            System.out.println(number1 / number2);
        } catch (RuntimeException e) { // isim RuntimeException olsa da 0 a bölünce ArithmeticException,
            System.out.println(e);     // letter girince InputMismatchException döndürdü.
        }
        // ArithmeticException, InputMismatchException < RuntimeException < Exception
    } // bir exceptionun üstüne ondan daha kapsayıcı bir exception yazamayız
}