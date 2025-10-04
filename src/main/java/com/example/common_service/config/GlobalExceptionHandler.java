package com.example.common_service.config;

import com.example.common_service.dto.BaseResponse;
import com.example.common_service.exception.BusinessException;
import com.example.common_service.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public BaseResponse<?> handleBusiness(BusinessException ex) {
        return BaseResponse.error(ex.getMessage(), HttpStatus.BAD_REQUEST.value());
    }

    @ExceptionHandler(NotFoundException.class)
    public BaseResponse<?> handleNotFound(NotFoundException ex) {
        return BaseResponse.error(ex.getMessage(), HttpStatus.NOT_FOUND.value());
    }

    @ExceptionHandler(Exception.class)
    public BaseResponse<?> handleGeneral(Exception ex) {
        return BaseResponse.error("Internal server error", HttpStatus.INTERNAL_SERVER_ERROR.value());
    }
}
