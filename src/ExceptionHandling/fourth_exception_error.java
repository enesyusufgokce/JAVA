// exception is a thing that we can catch and redirect but error affects the program and prevents the
// program's working
// exception is a hole, error is non-existing of the road

package ExceptionHandling;

import java.util.Scanner;

public class fourth_exception_error {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number3;

        try {
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            System.out.println(number1 / number2);
        }
        catch(Exception e){
            System.out.println("there is an exception");
        }
        // try dan da çıksa catch den de çıksa finally e girer
        finally{
            number3 = 2;
            System.out.println("finally bloğa girdim");
        }
        System.out.println("end of the program");
        System.out.println(number3);
    }
}