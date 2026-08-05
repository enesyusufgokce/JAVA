package Generics.Second;


public class Main2 {
    public static void main(String[] args) {
        Pair <String, Integer> p1 = new PairImpl <String, Integer>("password", 15358);
        Pair <String, Integer> p2 = new PairImpl <String, Integer>("Yusuf", 129999);

        System.out.println(PairImpl.compare(p1, p2));
    }
}
