package shop_ease_v20.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop_ease_v20.models.CartItem;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartItemDTO {

    private Long id;
    private ProductDTO product;
    private int quantity;

    public CartItemDTO(CartItem cartItem) {
        this.id = cartItem.getId();
        this.product = new ProductDTO(cartItem.getProduct());
        this.quantity = cartItem.getQuantity();
    }
}

