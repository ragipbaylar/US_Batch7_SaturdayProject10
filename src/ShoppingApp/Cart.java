package ShoppingApp;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private double total;
    private List<Product> cartProducts;

    public Cart() {
        this.total = 0;
        this.cartProducts = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double price) {
        this.total += price;
    }

    public List<Product> getCartProducts() {
        return cartProducts;
    }

    public void setCartProducts(List<Product> cartProducts) {
        this.cartProducts = cartProducts;
    }
}
