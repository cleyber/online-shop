package repository;

import entity.Product;

public interface ProductRepository {
    public void save(Product product);

    public void update(Product product);
}
