public class Registry {
    public static void main(String[] args) {
        Surgeon doctor1 = new Surgeon("Евгений");
        Dental doctor2 = new Dental("Варвара");
        Otolaryngologist doctor3 = new Otolaryngologist("Эвелина");

        Director director = new Director();

        Patient patient1 = new Patient("Серега", 1488,"зуб");
        Patient patient2 = new Patient("Кирилл",null,"глаза");

        doctor2.treatment(patient1);
        doctor2.treatment(patient1);
        director.givPrize(doctor2);

        director.givPrize(doctor2);
    }
}
