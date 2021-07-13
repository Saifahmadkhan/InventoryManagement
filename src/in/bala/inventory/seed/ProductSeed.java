package in.bala.inventory.seed;

import in.bala.inventory.model.Product;
import in.bala.inventory.repository.ProductRepository;

import java.util.HashSet;

public class ProductSeed {

    public static ProductRepository createProductDataSet(){
        ProductRepository productRepo=new ProductRepository();
        HashSet<Product>productList=new HashSet<>();
        productList.add(new Product(101,"Lemon",25d,190));
        productList.add(new Product(102,"Apple",160d,50));
        productList.add(new Product(103,"Banana",15d,190));
        productList.add(new Product(101,"Mango",36,290));
        productList.add(new Product(101,"JackFruit",15d,500));
        productRepo.addAllProduct(productList);
        return  productRepo;
    }


}
