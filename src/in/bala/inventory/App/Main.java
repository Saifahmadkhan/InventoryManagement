package in.bala.inventory.App;

import in.bala.inventory.controller.CartController;
import in.bala.inventory.controller.OrderController;
import in.bala.inventory.controller.ProductController;
import in.bala.inventory.model.Product;
import in.bala.inventory.repository.ProductRepository;

import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        ProductController pc=new ProductController() ;
        CartController cc=new CartController() ;
        OrderController oc=new OrderController();
        while(true) {
            System.out.println("Menu");
            System.out.println("1. Get All Products\n"+
                               "2. Add Product to Cart\n"+
                               "3. View Cart Summary\n"+
                               "4. Checkout and Order\n" +
                               "5. View past Order\n"+
                               "Press 0 for EXIT");
            int option=Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:
                    pc.displayAllProducts();
                    break;

                case 2:
                    //add product to cart
                    System.out.println("Enter product id");
                    int id = Integer.parseInt(scan.nextLine());
                    Product result = pc.findProductById(id);
                    if (result == null) {
                        System.out.println("Invalid Product ID");
                    } else {
                        System.out.println("Product details for Product ID " + id);
                        System.out.println(result.toString());
                        System.out.println("Quantity you want to buy");
                        int quantity = Integer.parseInt(scan.nextLine());
                        if (quantity > 0 && quantity < result.getQuantity()) {
                            System.out.println("Product added to your cart");
                            cc.addProduct(result, quantity);
                            //System.out.println("Your cart total is "+cc.getCartTotal());
                            System.out.println("Your CURRENT CART STATUS");
                            cc.cartSummary();
                        } else {
                            System.out.println("Enter appropriate quantity");
                        }

                    }
                    break;
                case 3:
                    //cart Summary
                    System.out.println("Your CART SUMMARY");
                    cc.cartSummary();
                    break;

                case 4:
                    //Convert Order
                    System.out.println("Order placed successfully");
                    System.out.println("Your ORDER SUMMARY");
                    oc.checkout(pc,cc);
                    break;

                case 5:
                    //order summary
                    System.out.println("PAST ORDERS");
                    oc.getOrderSummary();
                    break;

                default:
                    option=0;
            }
            if(option==0)
                break;

        }

    }
}

//   REMOVE EMPTY CART CHECKOUT
//   REMOVE EMPTY CART CHECKOUT
//   REMOVE EMPTY CART CHECKOUT
//   REMOVE EMPTY CART CHECKOUT
//   REMOVE EMPTY CART CHECKOUT