package ShoppingApp;

public class RegularSeller extends Seller {


    public RegularSeller(String name, String address) {
        super(name, address);
        setFeeFromPerSale(0.10);
        setUserType(UserType.REGULAR);
    }

    @Override
    public void sellProduct(Product product) {
        setBalance(product.getPrice() - (product.getPrice() * getFeeFromPerSale()));
        product.setStock(product.getStock() - 1);
    }
}

