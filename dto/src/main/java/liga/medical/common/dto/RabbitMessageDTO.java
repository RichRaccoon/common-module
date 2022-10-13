package liga.medical.common.dto;

import lombok.Data;

@Data
public class RabbitMessageDTO {
    private MessageType type;
    private String content;
}
