package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.entity.Product;
import net.javaguides.springboot.repository.ProductRepository;
import net.javaguides.springboot.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product searchProducts(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product UpdateProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product deleteProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        List<Product> products= productRepository.findAll();
        return products;
    }

    @Override
    public Product getProductById(long productId) {
        Optional<Product> product = productRepository.findById(productId);
        return product.get();
    }

}
