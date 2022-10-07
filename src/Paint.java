public class Paint {
    private String name;

    private double costPerCan;

    private int canSizeMl;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerCan() {
        return costPerCan;
    }

    public void setCostPerCan(double costPerCan) {
        this.costPerCan = costPerCan;
    }

    public int getCanSizeMl() {
        return canSizeMl;
    }

    public void setCanSizeMl(int canSizeMl) {
        this.canSizeMl = canSizeMl;
    }

    public Paint(String name, double costPerCan, int canSizeMl){
        this.name = name;
        this.costPerCan = costPerCan;
        this.canSizeMl = canSizeMl;
    }
}
