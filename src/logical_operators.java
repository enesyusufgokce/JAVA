import java.util.Scanner;

public class logical_operators {
    public static void main(String[] args) {
        //  or ||
        //  and &&

        Scanner scanner = new Scanner(System.in);
         int num = scanner.nextInt();
         if (num > 0 && num < 100){
             System.out.println("hello comrade");
         }
         scanner.nextInt();
         if (num < 0 || num > 100){
             System.out.println("hello second comrades");
         }
        if (false || false || false || false || true){
             System.out.println("you got it");
         }
    }
}
