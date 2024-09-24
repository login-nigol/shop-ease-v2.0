package shop_ease_v20.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop_ease_v20.models.OrderItem;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO {

    private Long id;
    private ProductDTO product;
    private Integer quantity;
    private BigDecimal price;

    public OrderItemDTO(OrderItem orderItem) {
        this.id = orderItem.getId();
        this.product = new ProductDTO(orderItem.getProduct());
        this.quantity = orderItem.getQuantity();
        this.price = orderItem.getPrice();
    }
}
