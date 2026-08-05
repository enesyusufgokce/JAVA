package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class third {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        try{
            num1 = scanner.nextInt();
        }
        catch (InputMismatchException e){
            scanner.nextLine();
            System.out.println("adam gibi sayı gir döverim");
            num1 = scanner.nextInt();

        }
        System.out.println("number is: " + num1); // hata verdi, ya try da hata atarsa num1 setlenmeden
        // catch e gideceği için orda da num1 setlenmediği için bu printte num1 initalize edilemeyecek diyor.
        // o yüzden catch te num1 = scanner.nextInt(); dedik.
    }
}
