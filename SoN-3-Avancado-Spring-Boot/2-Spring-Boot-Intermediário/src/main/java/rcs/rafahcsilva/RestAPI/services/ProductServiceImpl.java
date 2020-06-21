package rcs.rafahcsilva.RestAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rcs.rafahcsilva.RestAPI.models.Product;
import rcs.rafahcsilva.RestAPI.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> findAll() {
        return this.productRepository.findAll();
    }

    @Override
    public Optional<Product> find(Long id) {
        return this.productRepository.findById(id);
    }

    @Override
    public Product create(Product product) {
        return this.productRepository.save(product);
    }

    @Override
    public Product update(Long id, Product product) {
        Optional<Product> productExists = this.productRepository.findById(id);
        productExists.ifPresent(value -> {
            product.setId(value.getId());
            this.productRepository.save(product);
        });
        return null;
    }

    @Override
    public void delete(Long id) {
        Optional<Product> product = this.productRepository.findById(id);
        product.ifPresent(p -> this.productRepository.delete(p));
    }
}
