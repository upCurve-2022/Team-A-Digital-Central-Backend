package net.javaguides.springboot.controller;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")

public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }
@GetMapping
    public Product searchProducts(@RequestParam Product product)
    {
        return productService.searchProducts(product);
    }
@PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }
@PutMapping
    public Product UpdateProduct(@RequestBody Product product)
{
    return productService.UpdateProduct(product);
}

@DeleteMapping
    public Product deleteProduct(@RequestBody Product product){
    return productService.deleteProduct(product);}
}

