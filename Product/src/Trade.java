
import java.util.List;
import java.util.ArrayList;
public class Trade <Product> implements MontrealTradedProducts<Product>{
    List<Product> trades = new ArrayList<>();


    @Override
    public void addNewProduct(Product product) throws ProductAlreadyRegisteredException {

    }

    @Override
    public void trade(Product product, int quatity) {

    }

    @Override
    public int totalTradeQualityForDay() {
        return 0;
    }

    @Override
    public double totalVaulueOfDaysTradeProducts() {
        return 0;
    }
}
