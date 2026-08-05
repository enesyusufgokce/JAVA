public class variables1 {
    public static void main(String[] args){
        int n = 111210;
        int m  = 12 + 3; byte b = 32;
        float s = 21.2f;  // f yazmazsak onu double türünde algılar
        double d = 3223.1;
        long l = 24323234;

        int maximum = Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;
        double maximum2 = Double.MAX_VALUE;
        long g = maximum + 20;    // taştığı için saçmaladı. işlem int olarak yapıldı, sonra long a atandı
        long g2 = maximum + 20L;  // 20L long türünde olduğu için, binary numeric promotion gereği maximum
                            // değeri otomatik olarak long’a yükseltilir ve işlem long türünde gerçekleştirir,
                            // sonra g2 ye atar. int g2 dersek hata verir çünkü kapasitesi, 20L (long) un
                            // altında kalmış olur.
        int g3 = (int) (maximum + 20L);
        long g4 = (int) (maximum + 20L);

        // NOTE: Suffix yoksa tüm tam sayı literalleri int’tir.

        char a = 'a';
        char bb = 'b';

        boolean isTrue = true;
        boolean isFalse = false;

        System.out.print(n);
        System.out.println(m);
        System.out.println(b);
        System.out.println(s);
        System.out.println(d);  // double old. için sonuna .0 da koydu
        System.out.println(l);
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(maximum2);
        System.out.println(g);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
        System.out.println(a);
        System.out.println(bb);
        System.out.print("" + a + bb); // println ve print
                                        // içine tek bir değer alır. , ile ayrı ayrı değerler yollanmaz
        System.out.println(isTrue);
        System.out.println(isFalse);

        int i;
        i = 30;
        i = 40;
        System.out.println(i);
        //double i; diyemeyiz çünkü i adında bir variable zaten tanımlamıştık
    }
}

// boolean -> true, false
// byte -> 8 bit
// short -> 16 bit
// int -> 32 bit
// long -> 64 bit
// float -> 32 bit   virgüllü sayılar
// double -> 64 bit    virgüllü sayılar
// char -> 16 bit 0 to 65,535

// NOTE: Java’da aynı blokta aynı isimle ikinci kez değişken declare edemezsin
// ama int b = 12 dedikten sonra b = 14 diyebiliriz
