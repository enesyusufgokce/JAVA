package FinalExamSummary.Interface.Company;

public class Personel implements CanGetSalary, CanTakeLeave{

    private int money;
    private boolean onLeave;

    @Override
    public void getSalary(){
        money+=10000;
    }

    @Override
    public void takeLeave(){
        onLeave = true;
    }
}
