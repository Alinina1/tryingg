import java.util.Date;
import java.text.SimpleDateFormat;

public class Doctor {
    protected String name;
    protected String illness;
    protected int numberOfCured; // количество вылеченных пациентов


    private int getHour(){
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("kk");
        int a =Integer.parseInt(f.format(d));
        return a;
    }

    public void minusSick(){
        numberOfCured--;
    }

    public Doctor(String name,  String illness) {
        this.name = name;
        this.illness = illness;
        this.numberOfCured = 0;
    }


    public void treatment(Patient patient){
        if (patient.getPolicy() == null)
            System.out.println("Пациент идет в жопу, т.к. нет полиса");
        else if (patient.getSick() != this.illness)
            System.out.println("Пациент идет в жопу, т.к. пршел не к тому доктору");
        else if (getHour()>=13 && getHour() <=14 )
            System.out.println("Пациент идет в жопу, т.к. пиршел во время обеда");
        else {
            System.out.println("Пациент вылечен!");
            numberOfCured++;
        }
    }
}
