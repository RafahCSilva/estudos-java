package rcs.rafahcsilva.RestAPI.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rcs.rafahcsilva.RestAPI.models.Product;
import rcs.rafahcsilva.RestAPI.services.ProductService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @Autowired
    private ProductService productService;

    public ProductResource(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @ResponseBody
    public List<Product> findAll() {
        return this.productService.findAll();
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Optional<Product> findById(@PathVariable("id") Long id) {
        return this.productService.find(id);
    }

    @PostMapping
    @ResponseBody
    public Product create(@RequestBody Product product) {
        return this.productService.create(product);
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Product update(@PathVariable("id") Long id, @RequestBody Product product) {
        return this.productService.update(id, product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id, HttpServletResponse response) {
        this.productService.delete(id);
        response.setStatus(HttpServletResponse.SC_NO_CONTENT);
    }
}
