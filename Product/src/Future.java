public class Future{
    //declaring variables
    private String ID;
    private double Value;
    private int quan;

//constructor
    public Future(String ID, double value, int quan) {
        this.ID = ID;
        Value = value;
        this.quan = quan;
    }
//getters and setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getValue() {
        return Value;
    }

    public void setValue(double value) {
        Value = value;
    }

    public int getQuan() {
        return quan;
    }

    public void setQuan(int quan) {
        this.quan = quan;
    }
}
