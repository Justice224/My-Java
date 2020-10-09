public interface ProductPricingService {
    double price(String exchane, String ticker);
    double price(String exchage, String contractCode, int month, int yeah);
}
