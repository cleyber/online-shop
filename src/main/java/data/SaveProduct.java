package data;

import entity.Product;
import repository.ProductRepository;

public class SaveProduct implements ProductRepository {

    @Override
    public void save(Product product) {
        //aqui va el cuardado a la base de datos
    }
    @Override
    public void update(Product product) {
        //aqui va la actualizacion a la base de datos
    }
}
