package OOP.Interface.Language;

// interfaceler, bir diğer interface'i extends eder, implemente etmez, normal classlar interfaceleri implemente eder
public interface ProgrammingLanguages extends Language {
    // greed i yaz demedi, çünkü interfaceler de bir nebze soyutlardır, bir abstract class içinden başka bir
    // abstract class'ı extends ettiğimizde ona onu yazmaya zorlamaz. çünkü zaten normal bir classtan
    // ProgrammingLanguages'i implemente dediğimiz zaman ve bu PL de Language yi extend ettiği zaman Language nin
    // nethodlarına erişebilmiş oluyoz çünkü
}
