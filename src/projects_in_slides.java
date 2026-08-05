class projects_in_slides {
    public static void main(String[] args) {
        int i = 0;
        int result = i++ + i++ * i++;
        System.out.println(result);

    }
}

// show square roots of 1 to 99 and the rounding error

class SqrRoot{
    public static void main(String[] args){
        double num, sroot, rerr;
        for(num = 1.0; num < 100; num++){
            sroot = Math.sqrt(num);
            System.out.println("square root of the " + num + " is: " + sroot);

            rerr = num - (sroot * sroot);
            System.out.println("the rounding error is: " + rerr);
        }
    }
}

// print alphabet
class PrintAlphabet{
    public static void main(String[] args) {
        char ch;

        ch = 'a';
        // System.out.println(ch < 10);  10 da always false, 1000 de always true oluyo. I get the logic
        // sout(ch) iken prints as   a
        while(ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}

class Comma{
    public static void main(String[] args) {
        int i, j;
        for(i = 0, j = 10; i < j;){   // pre ya da post olması sonucu etkilemez burda
            System.out.println("i: " + i + "," + " j: " + j);
            ++i;
            --j;  // böyle de olur
        }
    }
}

class Break6 {
    public static void main(String[] args) {
        stop1: for (int x = 0; x < 5; x++){
            for (int y = 0; y < 5; y++){
                if (y==2){
                    break stop1;
                }
                System.out.println("x and y: " + x + " " + y);
            }
        } // break stop1 den sonra burdan devam eder
        System.out.println("x: " );

        for (int x = 0; x < 5; x++){
            stop1: for (int y = 0; y < 5; y++){
                if (y==2){
                    break stop1;
                }
                System.out.println("x and y: " + x + " " + y);
            }
        }
        System.out.println("xxx: " );
    }
}

class continue1 {
    public static void main(String[] args) {

        outerloop: for (int x = 0; x < 10; x++){
            System.out.println("x: " + x);
            for (int y = 0; y < 10; y++){
                if (y == 5){
                    System.out.println("x is: " + x + ", y must be 5 " + y);
                    continue outerloop;
                }
                System.out.println("x is: " + x + ", y: " + y);
            }
        }
    }
}

class ArraysMinMax{
    public static void main(String[] args) {
        int[] nums = new int[10];
        int min, max;

        nums[0] = 99;
        nums[1] = 929;
        nums[2] = -23;
        nums[3] = 34;
        nums[4] = 22627;
        nums[5] = 86;
        nums[6] = -95;
        nums[7] = -22;
        nums[8] = 4;
        nums[9] = 0;

        min = max = nums[0];
        for (int i = 1; i < nums.length; i++){  // i = 1  to prevent to check itself
            if (nums[i] < min) {
                min = nums[i];
            }
            else if (nums[i] > max) {
                max = nums[i];
            }
        }
        System.out.println("max: " + max + " min: " + min);
    }
}
class Recursion{
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
    }
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }
    }
    static int fibonacci(int n){  // 1, 1, 2, 3, 5, 8...    f(0)=1, f(1)=1, f(2)=2...
        if(n < 2){
            return 1;
        }
        else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}