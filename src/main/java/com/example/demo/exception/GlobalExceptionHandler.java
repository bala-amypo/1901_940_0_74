package com.example.demo.exception;
@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(ResourceNotFoundExpection.class){
        public ResponseEntity<>.(ex.getMessage(),HTTPStatus.NOT_FOUND){
            return new 
        }
    }

}