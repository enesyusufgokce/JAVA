public class operators {
    //  assignment, arithmetic, etc. operators exist
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = b - a;
        int e = a * b;
        int f = a / b;   // the result will be 0. if we say float instead of int, it will be 0.0. çünkü a ve b
        // yi int olarak alıyo. aynı zamanda başındaki int den dolayı da sonucu da int olarak yazdırıyo
        float g = (float)a / b;
        float ee = a / b;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(ee);

        float h = a % b;
        float i = 23 % 2;
        int j = 23 % 2;
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);

        b++;
        a--;
        System.out.println(b);
        System.out.println(a);

        a += b;  // a = a + b
        a /= b;  // a = a / b
        System.out.println(a);

        byte aa = 10;    // 1010
        byte bb = (byte)(aa>>1);  // 0101
        System.out.println(bb);

        int num = 10 * 3 - 9 / 3;
        System.out.println(num);

        // ---------------------------  IMPORTANT  --------------------------------------

        int x = 10;
        System.out.println(x++); // Ekrana 10 yazar (çünkü önce yazdırdı, sonra artırdı)
        System.out.println(x);   // Ekrana 11 yazar

        int y = 10;
        System.out.println(++y); // Ekrana 11 yazar (çünkü önce artırdı, sonra yazdırdı)
    }
}

/* NOTE:
int x = 10;
System.out.println(x++); // Ekrana 10 yazar (çünkü önce yazdırdı, sonra artırdı)
System.out.println(x);   // Ekrana 11 yazar

int y = 10;
System.out.println(++y); // Ekrana 11 yazar (çünkü önce artırdı, sonra yazdırdı)
*/