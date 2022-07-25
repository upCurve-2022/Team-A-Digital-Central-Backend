package net.javaguides.springboot.service;

import net.javaguides.springboot.entity.Product;

import java.util.List;

public interface ProductService {
    Product searchProducts(Product product);

    Product createProduct(Product product);
    Product UpdateProduct(Product Product);
    Product deleteProduct(Product product);

}
