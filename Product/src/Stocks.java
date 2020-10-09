public class Stocks  {
    //declaring Variables
    private String ID;
    private double Value;
    private int quan;

    //constructor
    public Stocks(String ID, double value, int quan) {
        this.ID = ID;
        Value = value;
        this.quan = quan;
    }
    //getters and setters
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
