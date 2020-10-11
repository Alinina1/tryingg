public class Therapist extends Doctor {

    IllnessTherapist illness;
    public Therapist(String name) {
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

enum IllnessTherapist
{
    осмотр,
    диагноз,
    лечение,
    лекарства
}