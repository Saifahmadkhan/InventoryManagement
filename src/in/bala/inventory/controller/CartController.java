package in.bala.inventory.controller;

import in.bala.inventory.model.Cart;
import in.bala.inventory.model.Product;

import javax.sound.midi.Soundbank;
import java.util.Set;

public class CartController {
    private Cart cart= new Cart();
    public void addProduct(Product p,int quantity){
        cart.addProduct(p,quantity);
    }

    public double getCartTotal(){
        Set<Product> set = cart.getAllProducts();
        double total=0;
        for (Product p:set) {
            total+=p.getQuantity()*p.getPrice();
        }
        return total;
    }

    public void cartSummary(){
        System.out.println("Your cart total is "+getCartTotal());
        Set<Product> set = cart.getAllProducts();
        if(set.size()==0){
            System.out.println("Your cart is EMPTY");
        }
        for (Product p: set) {
            System.out.println(p.toString());
        }
    }

    public Set<Product> getAllProducts(){
        return cart.getAllProducts();
    }

    public void makeEmpty(){
        cart=new Cart();
    }
}
