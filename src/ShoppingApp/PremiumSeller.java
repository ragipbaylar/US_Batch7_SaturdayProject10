package ShoppingApp;

public class PremiumSeller extends Seller{


    public PremiumSeller(String name, String address) {
        super(name, address);
        setFeeFromPerSale(0.5);
        setUserType(UserType.PREMIUM);
    }


    @Override
    public void sellProduct(Product product) {
        setBalance(product.getPrice()-(product.getPrice()*getFeeFromPerSale()));
        product.setStock(product.getStock()-1);
    }
}
