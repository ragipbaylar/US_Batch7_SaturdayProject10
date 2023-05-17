package ShoppingApp;

public abstract class Buyer extends User{

    public Buyer(String name, String address) {
        super(name, address);
    }

    public abstract void checkOut(PaymentMethod paymentMethod);

    public abstract double calculateShippingCost();
}
