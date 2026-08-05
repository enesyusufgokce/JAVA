public class recursiencikims {
    public double recursion(int n){
        if(n == 0){
            return 1.0;
        }
        else {
            return 1.0 + 1.0 / recursion(n - 1);
        }
    }
}
//
//class arrayCikmis{
//    public int secondLargest(int[] intArray){
//        int max = intArray[0];
//        int secondMax = intArray[0];
//        for (int i = 0; i < intArray.length; i++){
//            if (intArray[i] > max){
//                max = intArray[i];
//            }
//            if (intArray[i] == max){
//                int control = 0;
//                control++;
//                if (control == intArray.length){
//                    return -1;
//                }
//            }
//        }
//        return
//    }
//}
