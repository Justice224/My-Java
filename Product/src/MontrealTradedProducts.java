//interface
public interface MontrealTradedProducts<Product> {

    void addNewProduct(Product product) throws ProductAlreadyRegisteredException;

    void trade (Product product, int quatity);

    int totalTradeQualityForDay();

    double totalVaulueOfDaysTradeProducts();
}
