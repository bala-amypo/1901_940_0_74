package com.example.demo.exception;
@RestControllerAdvice
public class GlobalExceptionHandler{
    @ExceptionHandler(ResourceNotFoundExpection.class){
        public ResponseEntity<String> handleNotFound(ResourceNotFoundException ex){
             return new ResponseEntity<>.(ex.getMessage(),HTTPStatus.NOT_FOUND);
        }
    }
    @ExceptionHandler()
    }

}