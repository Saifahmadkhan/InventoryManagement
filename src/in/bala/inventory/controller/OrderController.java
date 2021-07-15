package in.bala.inventory.controller;

import in.bala.inventory.model.Order;
import in.bala.inventory.model.Product;

import java.util.Set;

public class OrderController {
    private Order order = new Order();

    public void checkout(ProductController pc, CartController cc){
        order=new Order(100,"Customer100",cc.getAllProducts());
        Set<Product> cartSet = cc.getAllProducts();
        Set<Product> repoSet = pc.getAllProducts();
        for (Product p:cartSet) {
            int id=p.getId(); int quantity=p.getQuantity();
            int prev_quantity=pc.findProductById(id).getQuantity();
            pc.findProductById(id).setQuantity(prev_quantity-quantity);
        }
        cc.cartSummary();
        cc.makeEmpty();
    }

    public void getOrderSummary(){
        Set <Product> set=order.getProducts();
        if(set.size()==0){
            System.out.println("NO ORDER HISTORY");
        }
        else {
            System.out.println("Order ID "+order.getOrderId()+" "+"Customer Name "+order.getCustomer_name());
            for (Product p : set) {
                System.out.println(p.toString());
            }
        }
    }


    }
