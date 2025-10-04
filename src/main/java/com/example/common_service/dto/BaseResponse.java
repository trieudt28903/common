package com.example.common_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BaseResponse<T> {
    private int status;
    private String message;
    private T data;

    public static <T> BaseResponse<T> success(T data) {
        return BaseResponse.<T>builder()
                .status(200)
                .message("Success")
                .data(data)
                .build();
    }

    public static <T> BaseResponse<T> error(String message, int status) {
        return BaseResponse.<T>builder()
                .status(status)
                .message(message)
                .build();
    }
}

