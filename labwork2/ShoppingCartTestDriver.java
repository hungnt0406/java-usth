package labwork2;

public class ShoppingCartTestDriver {
    public static void main(String[] args) {
        ShoppingCart product1 = new ShoppingCart();
        product1.removeFromCart();
        product1.addToCart();
        product1.checkOut();
    }
}
