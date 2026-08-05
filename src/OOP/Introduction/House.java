package OOP.Introduction;

// bir class, ondan üretilecek object'in taslağıdır, şemasıdır

/*
class ClassName{
    fields,
    methods
}
*/

// states represent fields, behaviors represent methods

public class House {
    // üretilecek her ev için bu özellikler standard olsun diye sabit değerler verdik.
    // istersek mainde house1.doorColor = "Blue" diyip değiştire de biliriz
    String doorColor = "Orange";
    String roofColor = "Blue";
    String windowShape;
    int dateOfBuilt = 2011;
}
