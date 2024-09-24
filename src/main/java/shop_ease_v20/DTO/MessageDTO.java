package shop_ease_v20.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import shop_ease_v20.models.Message;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO {

    private Long id;
    private Long senderId;
    private Long receiverId;
    private String content;
    private LocalDateTime createdAt;

    public MessageDTO(Message message) {
        this.id = message.getId();
        this.senderId = message.getUser().getId();
        this.receiverId = message.getUser().getId();
        this.content = message.getContent();
        this.createdAt = message.getSentAt();
    }
}
