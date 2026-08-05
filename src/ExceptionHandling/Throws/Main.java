package ExceptionHandling.Throws;

import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        FileManager fileManager = new FileManager();
        try {
            fileManager.createFile(filename);
        }
        catch (FileAlreadyExistsException e){
            filename = scanner.nextLine();
            try {
                fileManager.createFile(filename);
            }
            catch (IOException ex){
                throw new RuntimeException(ex);
            }
        }
        catch (IOException e){
            System.out.println("unexpected error");
        }
    }
}
// FileManager'de mantık iş mantığı ama ben bunu throws ile kullanıcıdan data aldığım kısma rise ettim. böylece
// main methodu içinde bunu yönlendirebilmeyi sağladık. FileManager içinde olsa yönlendiremezdim.
