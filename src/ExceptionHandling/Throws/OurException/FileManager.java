package ExceptionHandling.Throws.OurException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// IOExceptionları kontrol ediyoz, üstüne üstlük kendi kurguladığımız exceptionu da kontrol ediyoz 
public class FileManager {
    public void createFile(String name) throws IOException, FileNameCannotContainBadWordsException{
        if (name.contains("mal")){  // FileNameCannotContainBadWordsException fırltabilecek kısım
            throw new FileNameCannotContainBadWordsException(name + "is inappropriate");
        }
        Files.createFile(Path.of(name));  // IOException fırlatabilecek kısım
    }
}