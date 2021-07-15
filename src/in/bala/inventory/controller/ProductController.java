package in.bala.inventory.controller;

import in.bala.inventory.model.Product;
import in.bala.inventory.repository.ProductRepository;
import in.bala.inventory.seed.ProductSeed;

import java.util.Set;

public class ProductController {
    private ProductRepository repo= ProductSeed.createProductDataSet();
    public void displayAllProducts(){
        repo.getAllProducts().forEach((P)->System.out.println(P.toString()));
    }
    public Set<Product> getAllProducts(){
        return repo.getAllProducts();
    }
    public Product findProductById(int id){
        return repo.getProductById(id);
    }

}
