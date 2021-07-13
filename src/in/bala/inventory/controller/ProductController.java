package in.bala.inventory.controller;

import in.bala.inventory.repository.ProductRepository;
import in.bala.inventory.seed.ProductSeed;

public class ProductController {
    private ProductRepository repo= ProductSeed.createProductDataSet();
    public void displayAllProducts(){
        repo.getAllProducts().forEach((P)->System.out.println(P.toString()));

    }

}
