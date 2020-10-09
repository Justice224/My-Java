//Exception handling
public class ProductAlreadyRegisteredException extends Exception {

    public ProductAlreadyRegisteredException(String excep) {
        super(excep);
    }
    @Override
    public String toString() {
        return ("Product already registed");
    }

}
