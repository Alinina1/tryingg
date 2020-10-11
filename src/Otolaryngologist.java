public class Otolaryngologist extends Doctor{

    IllnessLOR illness;

    public Otolaryngologist(String name) {
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

enum IllnessLOR
{
    ухо,
    горло,
    нос
}