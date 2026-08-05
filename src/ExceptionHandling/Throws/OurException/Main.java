package ExceptionHandling.Throws.OurException;

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
        catch (FileNameCannotContainBadWordsException | FileAlreadyExistsException e){
            System.out.println(e);
            System.out.println("this file is already exist or contains bad words");
        }
        catch (IOException e){
            try {
                fileManager.createFile(filename);
            }
            catch (IOException | FileNameCannotContainBadWordsException exception){
                throw new RuntimeException();  // yine exception alıyosan benden bu kadar.
            }
        }
    }
}
