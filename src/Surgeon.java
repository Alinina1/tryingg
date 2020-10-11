public class Surgeon extends Doctor {

    IllnessSurgeon illness;

    public Surgeon(String name) {
        super(name);
    }
    public boolean checkIllness(String illness){
        boolean exist = true;
        try{
            this.illness.valueOf(illness);
        }
        catch (IllegalArgumentException e){
            exist = false;
        }
        return exist;
    }

}

enum IllnessSurgeon
{
    перелом,
    травма,
    ушиб,
    опухоль,
    грыжа
}