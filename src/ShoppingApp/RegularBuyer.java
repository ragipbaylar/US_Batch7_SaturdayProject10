package ShoppingApp;

public class RegularBuyer extends Buyer{

    public RegularBuyer(String name, String address) {
        super(name, address);
    }

    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        for (Product product : getCart().getCartProducts()) {
            product.getSeller().sellProduct(product);
        }

        if (paymentMethod==PaymentMethod.CREDITCARD){
            System.out.println("$"+(getCart().getTotal()+calculateShippingCost())+" has been deducted from your card");
        }else if (paymentMethod==PaymentMethod.CASHonDELIVERY){
            System.out.println("The amount you must pay on delivery is $"+(getCart().getTotal()+calculateShippingCost()));
        }
    }

    @Override
    public double calculateShippingCost() {
        double cost = 0;
        if (getCart().getTotal() < 50)
            cost = getCart().getTotal()*0.10;

        return cost;
    }
}
