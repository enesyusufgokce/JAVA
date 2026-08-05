import java.util.Arrays;

public class Methods2 {
    public static void main(String[] args) {

        int rec_factorial = factorial(5);
        System.out.println(rec_factorial);

        // StackOverflow -> main(new String[]{});
        // StackOverflow -> sayHello1();
        int value = add(10, 20);
        System.out.println(value);
        System.out.println(add(50, 60, 70)); // 3 parametre olduğu için ona uygun olan overload methodu kullandı
        System.out.println(add("yusuf's calculator", 1,2));
        System.out.println(add(1,2,"ömer's calculator"));

        int a = 100;
        changeValue(a); // 30
        System.out.println(a); // 100
        // primitive typelerin hepsi, "pass by value" olarak geçer
        int[] arr = {1, 2, 3};
        changeValue(arr); // [1, 50, 3]
        System.out.println(Arrays.toString(arr)); // [1, 50, 3]
        // non-primitive types, "pass by reference" olarak geçer
    }

    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }

    // infinite loop
   static void sayHello1(){
       System.out.println("Hello");
       sayHello2();
   }
   static void sayHello2(){
       System.out.println("Hello");
       sayHello3();
   }
   static void sayHello3(){
       System.out.println("Hello");
       sayHello1();
   }
   // method overloading - method ismi aynıyken, en az bir parametre tipi farklı olursa veya farklı tipteki
   // parametrelerin yerleri değişirse "method overloading" olur. (static double diyip falan kurtaramazsın)
    static int add(int num1, int num2) {
        return num1 + num2;
    }
    static int add(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
    static int add(String nameofCalculator, int num1, int num2){
        System.out.println("name of the calculator is: " + nameofCalculator);
        return num1 + num2;
        // note: return ederken bir int return etmeli çünkü methodun type'ı int
    }
    static int add(int num1, int num2, String nameofCalculator){
        System.out.println("name of the calculator is: " + nameofCalculator);
        return num1 + num2;
    }

    static void changeValue(int a){
        a = 30;
        System.out.println(a);
    }
    static void changeValue(int[] a){
        a[1] = 50;
        System.out.println(Arrays.toString(a));
    }
}

// recursion, overloading