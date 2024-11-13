package labwork2;

public class ShoppingCart {
    private String cartContents;

    public static int product = 0;

    public void setContent(String Content){
        this.cartContents = Content;
    }
    public String getContent(){
        return cartContents;
    }

    public void addToCart(){
        product++;
        System.out.println("add to cart successfully");
    }


    public void removeFromCart(){
        if(product == 0){
            System.out.println("nothing to remove ");
        }
        else{
            product--;
            System.out.println("remove from cart successfully");
        }
    }

    public void checkOut(){
        if(product == 1){
            System.out.println("1 product in the cart");
        }
        if(product == 0){
            System.out.println("nothing in the cart");
        }
        else{
            System.out.println(product +"products in the cart");
  
        }
    }

}
