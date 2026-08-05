/*  constructoru öyle bir hatırlayayım diye şey ettiydim.

public class FileManager {
    int age = 22;
    String name = "Yusuf";

    public FileManager(int age, String name){
        this.age = age;
        this.name = name;
    }
}

*/

package ExceptionHandling.Throws;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileManager{

    /*

    public void createFile(String name){
        try {
            Files.createFile(Path.of(name)); // kızdı. çünkü IOException bir check exceptiondur. ya thrrows ile
            // bildiririz ya da try catch ini yazarız.
        }
        // note: throw new ... → hata fırlatmak (programı kesmek/yukarıya iletmek)
        //System.out.println(e) → sadece "hata buymuş kardeş" diye bilgi basmak
        catch (IOException e){
            throw new RuntimeException(e);
        }
    }
     */


// ben bethodu mainde çağırıyorum ve işin orda hallolmasını istiyorum. çözüm exception propagation
// exception propagation yaparak (throws keywordu ile) bir üst methoda fırlata fırlata iş mantığının daha uygun
// olduğu yerde catch bloğu yazılabilir ve oradan yönlendirilebilir.
// hatanın yönetilmesini istediğimiz yer bu method değilse throws ile bunu belirtiriz, bunu kullanan yer
// kendi içinde handle etsin ve kendisine uygun olduğu yerde bunu yönetsin.

// artık methodu burda try catch içine almıyoz. throws ile halledecez
public void createFile(String name) throws IOException{
    Files.createFile(Path.of(name));  // handle etmeliyiz çünkü IOException bir check exceptiondur
    }
}