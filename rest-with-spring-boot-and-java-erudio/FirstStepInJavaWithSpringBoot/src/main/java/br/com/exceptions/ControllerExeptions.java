package br.com.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@RestController
@ControllerAdvice
public class ControllerExeptions {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ExceptionResponse> returnAllExceptions(Exception ex, WebRequest request){
        ExceptionResponse exception = new ExceptionResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(false)
        );
        return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(UnsoppotedMathOperationException.class)
    public ResponseEntity<ExceptionResponse> returnMathException(Exception ex, WebRequest request){
        ExceptionResponse exception = new ExceptionResponse(
                new Date(),
                ex.getMessage(),
                request.getDescription(true)
        );
        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);
    }

}
