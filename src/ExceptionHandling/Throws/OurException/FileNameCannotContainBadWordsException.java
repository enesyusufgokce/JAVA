package ExceptionHandling.Throws.OurException;

// kendi exception classımızı oluşturduk
public class FileNameCannotContainBadWordsException extends Exception{
    public FileNameCannotContainBadWordsException(String message){
        super(message);
    }
}
// Senin sınıfın Java'nın built-in Exception sınıfından miras alıyor. Yani artık senin sınıfın da
// bir "Exception" — throw, try/catch, throws ile kullanılabilir. Exception'ın tüm yeteneklerini
// (mesaj saklama, stack trace, getMessage() vs.) bedavaya alıyorsun.
