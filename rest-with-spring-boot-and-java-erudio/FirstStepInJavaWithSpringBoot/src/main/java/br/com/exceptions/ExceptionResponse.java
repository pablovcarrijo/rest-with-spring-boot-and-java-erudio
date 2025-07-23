package br.com.exceptions;

import java.util.Date;

public record ExceptionResponse(Date errorTime, String message, String details) {}
