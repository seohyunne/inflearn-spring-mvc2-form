package hello.itemservice.domain.item;

import lombok.Data;

/**
 * FAST: 빠른 배송
 * NORMAL: 일반 배송
 * SLOW: 느린 배송
 */

@Data
public class DeliveryCode {
    private String code;
    private String displayName;

    public DeliveryCode(String normal, String 일반_배송) {
    }
}
