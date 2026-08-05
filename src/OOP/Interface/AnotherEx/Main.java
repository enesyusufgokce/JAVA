package OOP.Interface.AnotherEx;

public class Main implements A, B {
    public static void main(String[] args) {

        Main main = new Main();
        main.greed();
    }

    @Override
    public void greed(){  // ikisinin de adı aynı, sen hangisini çalıştıracağını söyle ben hallediyim diyo
        A.super.greed();
        B.super.greed();
    }
}
