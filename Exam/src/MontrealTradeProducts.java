public interface MontrealTradeProducts<Product> {

    void addNewProduct(Product product) throws ProductAlreadyRegisteredException;

    void trade (Product product, int quatity);

    int totalTradeQualityForDay();

    double totalVaulueOfDaysTradeProducts();


}
