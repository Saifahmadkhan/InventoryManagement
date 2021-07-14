package in.bala.inventory.model;

import java.util.HashSet;
import java.util.Set;

public class Cart {
    private int id;
    private Set<Product> products=new HashSet<>();

    public Cart() {
    }

    public Cart(int id, Set<Product> products) {
        this.id = id;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public void addProduct(Product p,int quantity){
        products.add(new Product(p.getId(),p.getName(),p.getPrice(),quantity));
    }

    public Set<Product> getAllProducts(){
        return products;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", products=" + products +
                '}';
    }
}
