// hata fırlatmak istiyosak "throw" keywordu ile fırlatıyoz. hatalar da en nihayetinde birer object
// olduğu için de bunları newleyerek gönderiyoz

package ExceptionHandling;

import java.util.Scanner;

public class fifth_main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0){
            // halihazır var olan bir exception -> throw new RuntimeException("I do not accept zero");
            // kendi exceptionumu attıracam
            throw new CannotAssignToZeroException("I cannot make equality to zero");
        }
        String osVersion = "windows";
        if (osVersion.equals("windows")){
            throw new OSNotSupportingError("abi bu işletim sistemi bende yok baybay");
        }
        // throw ile fırlattıktan sonra print çalışmadı. çünkü onu yakalayacak bir catch yok
        System.out.println("end of the program");
    }
}
