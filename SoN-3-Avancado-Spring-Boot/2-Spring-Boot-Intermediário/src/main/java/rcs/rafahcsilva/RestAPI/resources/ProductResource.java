package rcs.rafahcsilva.RestAPI.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import rcs.rafahcsilva.RestAPI.models.Product;
import rcs.rafahcsilva.RestAPI.services.ProductService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> findAll() {
        return new ResponseEntity<>(
                this.productService.findAll(),
                HttpStatus.OK
        );
    }

    @GetMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> findById(@PathVariable("id") Long id) {
        return new ResponseEntity<>(
                this.productService.find(id),
                HttpStatus.OK
        );
    }

    @PostMapping
    @ResponseBody
    @ResponseStatus(code = HttpStatus.CREATED)
    public ResponseEntity<?> create(@Valid @RequestBody Product product, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity
                    .badRequest()
                    .body(errors
                            .getAllErrors()
                            .stream()
                            .map(msg -> msg.getDefaultMessage())
                            .collect(Collectors.joining(", "))
                    );
        }
        return new ResponseEntity<Product>(
                this.productService.create(product),
                HttpStatus.CREATED
        );
    }

    @PutMapping("/{id}")
    @ResponseBody
    @ResponseStatus(code = HttpStatus.OK)
    public ResponseEntity<?> update(@PathVariable("id") Long id, @Valid @RequestBody Product product, Errors errors) {
        if (errors.hasErrors()) {
            return ResponseEntity
                    .badRequest()
                    .body(errors
                            .getAllErrors()
                            .stream()
                            .map(msg -> msg.getDefaultMessage())
                            .collect(Collectors.joining(", "))
                    );
        }
        return new ResponseEntity<Product>(
                this.productService.update(id, product),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") Long id) {
        this.productService.delete(id);
    }
}
