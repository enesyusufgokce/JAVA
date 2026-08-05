package OOP.Interface.Language;

public class Java implements ProgrammingLanguages {

    @Override
    public void greed(){
        printed(); // kendi methodun gibi çağır çünkü PL, Language yi extend ediyor zaten.
        System.out.println("System.out.println(\"HELLO WORLD\");");
    }

    @Override
    public void printed(){
        System.out.println("printed from Java class");
    }

}

// NOTE: super ne için kullanılır?
//super, alt sınıfın üst sınıfta override edilmiş bir metodun ya da fieldin orijinal halini çağırması içindir.
