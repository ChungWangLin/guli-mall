package com.jones.admin.exception;

import com.jones.common.exception.BusinessException;
import com.jones.common.pojo.dto.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BusinessException.class)
    public Result adminException(BusinessException e) {
        log.warn("发生异常:{}",e.getMessage());
        return Result.failed(e.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public Result exception(Exception e) {
      log.error(e.getMessage());
      return Result.failed();
    }
}
