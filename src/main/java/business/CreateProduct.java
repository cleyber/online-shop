package business;

import entity.Product;
import repository.ProductRepository;

public class CreateProduct {

    public void createProduct(Product product, ProductRepository productRepository) {
        productRepository.save(product);
    }
}
