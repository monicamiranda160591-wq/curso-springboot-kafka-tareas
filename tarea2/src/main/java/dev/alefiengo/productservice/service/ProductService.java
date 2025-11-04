package dev.alefiengo.productservice.service;

import dev.alefiengo.productservice.dto.ProductRequest;
import dev.alefiengo.productservice.dto.ProductResponse;
import dev.alefiengo.productservice.dto.ProductSummaryResponse;
import dev.alefiengo.productservice.exception.ResourceNotFoundException;
import dev.alefiengo.productservice.mapper.ProductMapper;
import dev.alefiengo.productservice.model.Product;
import dev.alefiengo.productservice.repository.ProductRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private final ProductRepository repository;

  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  public List<ProductResponse> findAll(String name) {
    List<Product> products = (name == null || name.isBlank())
        ? repository.findAll()
        : repository.findByNameContainingIgnoreCase(name);
    return products.stream()
        .map(ProductMapper::toResponse)
        .collect(Collectors.toList());
  }

  public ProductResponse findById(Long id) {
    Product product = repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Producto " + id + " no encontrado"));
    return ProductMapper.toResponse(product);
  }

  public ProductResponse create(ProductRequest request) {
    Product product = new Product();
    Product saved = repository.save(ProductMapper.toEntity(request, product));
    return ProductMapper.toResponse(saved);
  }

  public ProductResponse update(Long id, ProductRequest request) {
    Product product = repository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Producto " + id + " no encontrado"));
    Product updated = repository.save(ProductMapper.toEntity(request, product));

    return ProductMapper.toResponse(ProductMapper.toEntity(request, updated));
  }

  public void delete(Long id) {
    if (!repository.existsById(id)) {
      throw new ResourceNotFoundException("Producto " + id + " no encontrado");
    }
    repository.deleteById(id);
  }

  public List<ProductSummaryResponse> findAllAndSummary() {
    List<Product> products = repository.findAll();
    return products.stream()
        .map(ProductMapper::toSummaryResponse)
        .collect(Collectors.toList());
  }
}
