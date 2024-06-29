package com.management.farm.api;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
@Slf4j
public class FarmManagementSystemControllerAdvice extends ResponseEntityExceptionHandler {

    @ResponseBody
    @ExceptionHandler
    protected String handleGeneric(RuntimeException ex) {
        log.error(ex.getMessage(), ex);
        return "An error occurred handling request.";
    }
}
