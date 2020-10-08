public class Registry {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Евгений", "хирургия","перелом");
        Doctor doctor2 = new Doctor("Варвара","стоматология","зубы");
        Doctor doctor3 = new Doctor("Эвелина","гинекология","пизда");

        Director director = new Director();

        Patient patient1 = new Patient("Серега", true,"зубы",13,20);
        Patient patient2 = new Patient("Кирилл",false,"глаза",10,00);

        doctor2.treatment(patient1);
        director.givPrize(doctor2);
    }
}
