//creating interface
public interface PublicPricingService {
    double price(String exchane, String ticker);
    double price(String exchage, String contractCode, int month, int year);
}
