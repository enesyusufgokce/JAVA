/*
                                            object
                                               |
                                            throwable
                                                |
             --------------------------------------------------------------
             |                                                            |
        exceptions                                                      error
             |                                                            |
             ----checked exceptions:                                      ---- Virtual Machine Error
                IO or Compile Time exception                              |
             |                                                            ---- Assertion Error etc.
             ----unchecked exceptions:
                Runtime or Null Pointer exceptions


// checked exceptionda hatayı ele almak (try-catch) ya da metot imzasında belirtmek (throws) zorundasınızdır

*/

package ExceptionHandling;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;

public class second {
    public static void main(String[] args) {

        int[] arr = new int[5];

        try{
            for (int i = 0; i < arr.length; i++){
                System.out.println(arr[i]);
                if (i == 2){
                    throw new RuntimeException("asdf");
                }
            }
            System.out.println("blabla");  // throw new gördüğü zaman aşağısı okunmaz, direkt catch e atlar
            // yani hata çıktığı an alt satır okunmadan catch e girilir
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("an error occured, check the algorithm");
        }
        // note: bu bir uncheck exceptiondur ve bizi try a yazmaya zorlamıyor.

        // try catch e almaya zorluyo. (main de args) throw IOException la da oluyor da))
        try{
            Files.createFile(Path.of("can you subscribe"));
        }
        catch(FileAlreadyExistsException e){
            System.out.println(e);
            System.out.println("file already exist bro");
        }
        catch (IOException e){  // IOException'ı catch etmemizin nedeni, Files.createFile metodunun imzasında
            // throws IOException yazması. IOException checked bir exception olduğu için, böyle bir metodu
            // çağıran kod ya try/catch ile yakalamak ya da kendi imzasına throws eklemek zorunda
            // JDK da methodu böyle buldum:
            // public static Path createFile(Path path, FileAttribute<?>... attrs) throws IOException

            // catch a IOException yazarsak bunları ve dahasını alabiliriz. IOException bir şemsiye sınıf gibi
            // FileAlreadyExistsException
            // NoSuchFileException
            // catch a bunlardan birini yazarak daha spesifik bir durum için bir hata vermesini sağlayabiliriz

            System.out.println(e); // FileAlreadyExistsException verdi. catch de direkt IOException yazsa bile
            // çünkü bu onun alt sınıfı. polymorphism var aslında
            System.out.println("an error occurred when the file is initializing");
            // ilk seferde file yok diye hata atmadı, ikinci çalıştırmamda zaten oluşmuş olduğu için hata attı
        }
    }
}
// irfan catch ın içine tekrardan createFile yapıp dosya zaten varsa "file name" + 10000 aralığında random number
// kullanarak dosya varsa farklı isimlerde dosya oluşturulmasını sağladı. myFile, myFile342, myFile4354 ...
// note: rumtime errorları genelde if else lerle engellemeye çalışıyoz. zaten unchecked oldukları için
// try catch yazmak zorunda değiliz