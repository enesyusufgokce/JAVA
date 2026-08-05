// arrays are objects (reference types, not primitive types)

public class Arrays1 {
    public static void main(String[] args) {

        int[] int_array = new int[4];
        System.out.println(int_array[1]);
        System.out.println(int_array.length);  // 4 elemanı  var. [] içindeki değer kaç eleman alacağını söyler

        boolean[] bool_array = new boolean[3];
        System.out.println(bool_array[0]);
        System.out.println(bool_array.length);

        int_array[0] = 10;
        int_array[1] = 20;
        int_array[3] = 30;

        int element1 = int_array[0];
        int element2 = int_array[1];
        int element3 = int_array[2];
        int element4 = int_array[3];

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);
        System.out.println(element4);

        bool_array[2] = true;
        boolean bool_element1 = bool_array[0];
        boolean bool_element2 = bool_array[1];
        boolean bool_element3 = bool_array[2];

        System.out.println(bool_element1);
        System.out.println(bool_element2);
        System.out.println(bool_element3);


        for (int i = 0; i < int_array.length; i++){
            System.out.println(int_array[i]);
        }
        for (int i = 0; i < bool_array.length; i++){
            System.out.println(bool_array[i]);
        }
        for (int i = 0; i < int_array.length; i++){
            int_array[i] = int_array[i] + 10;
            System.out.println(int_array[i]);
        }
        System.out.println("----");

        int[] int_array2 = {20, 30, 40, 50, 60};
        boolean[] bool_array2 = {true, false, true, true};

        System.out.println(int_array2[2]);
        int_array2[2] = 41;
        System.out.println(int_array2[0]);
        int_array2[0] = 21;
        System.out.println(int_array2[2]);
        System.out.println(int_array2[0]);

        for (int i = 0; i < bool_array2.length; i++){
            System.out.println(bool_array2[i]);
        }

        System.out.println("-----");

        bool_array2[3] = false;
        for(int i = 0; i < bool_array2.length; i++){
            System.out.println(bool_array2[i]);
        }

        System.out.println("-----");

        System.out.println(int_array[2]);
        System.out.println(bool_array[2]);
    }
}