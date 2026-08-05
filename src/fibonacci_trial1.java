public class fibonacci_trial1 {

    public static int fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(0));
    }
}



class fibbonacci {

    public static int fibbonaaacci(int n){
        if (n <= 1){
            return n;
        }
        return fibbonaaacci(n - 1) + fibbonaaacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibbonaaacci(0));
        System.out.println(fibbonaaacci(3));
    }
}