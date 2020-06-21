package rcs.rafahcsilva.RestAPI.services;

import rcs.rafahcsilva.RestAPI.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();

    Optional<Product> find(Long id);

    Product create(Product product);

    Product update(Long id,Product product);

    void delete(Long id);

}
