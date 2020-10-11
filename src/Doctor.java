import java.util.Date;
import java.text.SimpleDateFormat;

public abstract class  Doctor {
    protected String name;
    protected int numberOfCured; // количество вылеченных пациентов
    protected boolean checkIllness = false;

    private int getHour(){
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("kk");
        int a =Integer.parseInt(f.format(d));
        return a;
    }

    public void minusSick(){
        numberOfCured = 0;
    }

    public Doctor(String name) {
        this.name = name;
        this.numberOfCured = 0;
    }

    protected abstract boolean checkIllness(String illness);

    public void treatment(Patient patient){
        if (patient.getPolicy() == null)
            System.out.println("Пациент идет в жопу, т.к. нет полиса");
        else if (!checkIllness(patient.getSick()))
            System.out.println("Пациент идет в жопу, т.к. пршел не к тому доктору");
        else if (getHour()>=13 && getHour() <=14 )
            System.out.println("Пациент идет в жопу, т.к. пиршел во время обеда");
        else {
            System.out.println("Пациент вылечен!");
            numberOfCured++;
        }
    }
}
