public abstract class Membership {

    // private variables
    private String name;
    private double fee;
    private int duration;
    private String type;

    // Constructor
    public Membership(String name, double fee, int duration, String type) {
        this.name = name;
        this.fee = fee;
        this.duration = duration;
        this.type = type;
    }

    // Getters method
    public String getName() {
        return name;
    }

    public double getFee() {
        return fee;
    }

    public int getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    // Abstract method (Abstraction)
    public abstract String display();
}