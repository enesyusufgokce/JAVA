import java.util.Scanner;

public class if_if_ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age > 18){
            System.out.println("you are on the first step");
            if(age > 25){
                System.out.println("you are on the second step");
            }
            else if (age < 20){
                System.out.println("inside of elif");
            }
        }
    }
}
