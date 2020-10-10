public class Director  {

    public void givPrize(Doctor doctor){
        System.out.println("Премия для доктора "+ doctor.name + " составила " + doctor.numberOfCured*100 + " рублей.");
        doctor.minusSick();
    }
}
