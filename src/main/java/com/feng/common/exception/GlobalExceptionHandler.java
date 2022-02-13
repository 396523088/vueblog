package com.feng.common.exception;

import com.feng.common.lang.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.ShiroException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author lastfeng
 * @Date 2022/2/14 0:31
 * @Description
 * 通过使用@ControllerAdvice来进行统一异常处理
 * @ExceptionHandler(value = RuntimeException.class)来指定捕获的Exception各个类型异常
 * 这个异常的处理，是全局的，所有类似的异常，都会跑到这个地方处理。
 * @Version 1.0
 **/
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(value = ShiroException.class)
    public Result handler(ShiroException e){
        log.error("运行时异常:----------------{}",e);
        return Result.fail(401,e.getMessage(),null);
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = RuntimeException.class)
    public Result handler(RuntimeException e){
        log.error("运行时异常:----------------{}",e);
        return Result.fail(e.getMessage());
    }

}
