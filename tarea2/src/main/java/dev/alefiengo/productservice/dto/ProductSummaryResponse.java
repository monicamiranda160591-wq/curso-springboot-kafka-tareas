package dev.alefiengo.productservice.dto;

import java.math.BigDecimal;

public record ProductSummaryResponse(
    Long id,
    String name,
    BigDecimal price
) {

}

