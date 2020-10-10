public class Patient {
    private String name;
    private String sick;
    private Integer policy;

    public Patient(String name, Integer policy, String sick) {
        this.name = name;
        this.policy = policy;
        this.sick = sick;
    }

    public Integer getPolicy() {
        return policy;
    }

    public String getSick() {
        return sick;
    }
}
