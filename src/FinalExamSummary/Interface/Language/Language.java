package FinalExamSummary.Interface.Language;

public interface Language {

    // default olarak public static final
    String a = "blabla";

    // default olarak public
    void greed();

    default void printed(){
        System.out.println("printed in language interface");
    }

    static void staticPrinted(){
        System.out.println("printed static in language interface");
    }
}
