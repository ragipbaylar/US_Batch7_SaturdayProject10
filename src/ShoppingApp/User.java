package ShoppingApp;

public class User {
    private String name;
    private String address;

    private Cart cart;
    private double shippingCost;
    private UserType userType;


    public User(String name, String address) {
        this.name = name;
        this.address = address;
        this.cart = new Cart();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void addToCart(Product product){
        this.cart.getCartProducts().add(product);
        this.cart.setTotal(product.getPrice());
    }

    public void removeFromCart(Product product){
        this.cart.getCartProducts().remove(product);
        this.cart.setTotal(-product.getPrice());
    }


    public static void deneme2(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }

    public void deneme1(){
        System.out.println("benden bu kadar");

    }
}
