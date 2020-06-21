package rcs.rafahcsilva.RestAPI.resources;

import org.springframework.web.bind.annotation.*;
import rcs.rafahcsilva.RestAPI.models.Product;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {
    @GetMapping
    @ResponseBody
    public List<Product> findAll() {
        return null;
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Product findById(@PathVariable("id") Long id) {
        return null;
    }

    @PostMapping
    @ResponseBody
    public Product create(@RequestBody Product product) {
        return null;
    }

    @PutMapping("/{id}")
    @ResponseBody
    public Product update(@RequestBody Product product) {
        return null;
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        return;
    }
}
