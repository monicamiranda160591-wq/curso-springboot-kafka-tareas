package dev.alefiengo.productservice.mapper;

import dev.alefiengo.productservice.dto.ProductRequest;
import dev.alefiengo.productservice.dto.ProductResponse;
import dev.alefiengo.productservice.dto.ProductSummaryResponse;
import dev.alefiengo.productservice.model.Product;

public final class ProductMapper {

  private ProductMapper() {
  }

  public static ProductResponse toResponse(Product product) {
    return new ProductResponse(
        product.getId(),
        product.getName(),
        product.getDescription(),
        product.getPrice(),
        product.getStock(),
        product.getCreatedAt(),
        product.getUpdatedAt()
    );
  }

  public static ProductSummaryResponse toSummaryResponse(Product product) {
    return new ProductSummaryResponse(
        product.getId(),
        product.getName(),
        product.getPrice()
    );
  }

  public static Product toEntity(ProductRequest request, Product entity) {
    entity.setName(request.name());
    entity.setDescription(request.description());
    entity.setPrice(request.price());
    entity.setStock(request.stock());
    return entity;
  }
}
