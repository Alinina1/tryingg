public class Patient {
    private String name;
    public String sick;
    public boolean policy;
    public int arrivalTimeH;
    public int arrivalTimeM;

    public Patient(String name, boolean policy, String sick, int hours, int minutes) {
        this.name = name;
        this.policy = policy;
        this.sick = sick;
        this.arrivalTimeH = hours;
        this.arrivalTimeM = minutes;
    }

}
