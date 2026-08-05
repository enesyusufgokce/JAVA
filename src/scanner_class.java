import java.util.Scanner;

public class scanner_class {
    public static void main(String[] args) {
        int number = 100;
        Scanner scanner = new Scanner(System.in);  // system.in klavyeden değerleri alır
        System.out.println("Enter your name");
        String name = scanner.nextLine();          // nextLine, bu değerleri stringe dönüştürüyor
                                                 // scanner aslında bunu formatlamamızı kolaylaştırmak için
        System.out.println("the name you entered is: " + name);

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        age += 20;
        System.out.println("the age you entered is " + age);

        System.out.print("Enter your score ");
        double score = scanner.nextInt();
        if (score > 50){
            System.out.println("your score is: " + score + " you are successfull");
        }
        else {
            System.out.println("your score is: " + score + " you failed");
        }
    }
}
