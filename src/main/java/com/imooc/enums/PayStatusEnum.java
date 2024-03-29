package com.imooc.enums;

import lombok.Getter;

/**
 * PayStatusEnum
 *
 * @author Achin
 * @since 2019-06-30 14:00
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),

    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
