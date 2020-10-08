public final class Doctor {
    public String name;
    private String speciality;
    private String illness;
    public int numberOfCured; // количество вылеченных пациентов


    public Doctor(String name,  String speciality, String illness) {
        this.name = name;
        this.speciality = speciality;
        this.illness = illness;
        this.numberOfCured = 0;
    }


    public void treatment(Patient patient){
        if (patient.policy == false)
            System.out.println("Пациент идет в жопу, т.к. нет полиса");
        else if (patient.sick != this.illness)
            System.out.println("Пациент идет в жопу, т.к. пршел не к тому доктору");
        else if (patient.arrivalTimeH>=13 && patient.arrivalTimeH<=14)
            System.out.println("Пациент идет в жопу, т.к. пиршел во время обеда");
        else {
            System.out.println("Пациент вылечен!");
            numberOfCured++;
        }
    }
}
