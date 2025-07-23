package br.com.exceptions;

public class UnsoppotedMathOperationException extends RuntimeException {
    public UnsoppotedMathOperationException(String message) {
        super(message);
    }
}
