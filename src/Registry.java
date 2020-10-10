public class Registry {
    public static void main(String[] args) {
        Surgeon doctor1 = new Surgeon("Евгений","перелом");
        Dental doctor2 = new Dental("Варвара","зубы");
        Otolaryngologist doctor3 = new Otolaryngologist("Эвелина","горло");

        Director director = new Director();

        Patient patient1 = new Patient("Серега", 1488,"зубы");
        Patient patient2 = new Patient("Кирилл",null,"глаза");

        doctor2.treatment(patient1);
        doctor2.treatment(patient1);
        director.givPrize(doctor2);

        director.givPrize(doctor2);
    }
}
