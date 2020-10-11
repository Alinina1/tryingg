public class Dental extends Doctor {

    IllnessDental illness;

    public Dental(String name) {
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

enum IllnessDental
{
    зуб,
    дёсны,
    нерв,
    кариес
}
