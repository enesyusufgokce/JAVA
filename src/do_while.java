public class do_while {
    public static void main(String[] args) {
        int i = 23;
        do{    // önce işlemi yapar (şart sağlanmasa da) sonra while a girer
            System.out.print(i + " ");
            i++;
            System.out.println(i);
        }
        while (i < 10);   // yukarıdakini kesin bir kere yapar, sonra bu while şartı sağlandığı sürece yapmaya devam eder
    }
}
