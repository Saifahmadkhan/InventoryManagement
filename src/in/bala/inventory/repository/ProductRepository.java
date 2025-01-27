package in.bala.inventory.repository;

import in.bala.inventory.model.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ProductRepository {
    private HashSet<Product> productHub=new HashSet<>();


    public boolean addProduct(Product p){
        return productHub.add(p);
    }

    public boolean addAllProduct(Set<Product> productSet){
        return productHub.addAll(productSet);
    }

   public Set<Product> getAllProducts(){
        return productHub;
   }


    public Product getProductById(int id){
        Product target=null;
        for (Product p:productHub) {
            if(p.getId()==id){
               target=p;
            }
        }
        return target;
    }

    public boolean deleteProduct(int id){   //return True is product is deleted
        boolean status=false;
        Product target= getProductById(id);
        if(target!=null){
           status= productHub.remove(target);
           status=true;
        }
        return status;
    }



}
