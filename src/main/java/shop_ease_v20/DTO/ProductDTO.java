package shop_ease_v20.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop_ease_v20.models.Product;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

    private Long id;
    private String productName;
    private String description;
    private BigDecimal price;
    private Integer quantity;

    public ProductDTO(Product product) {
        this.id = product.getId();
        this.productName = product.getProductName();
        this.description = product.getDescription();
        this.price = product.getPrice();
        this.quantity = product.getQuantity();
    }
}

