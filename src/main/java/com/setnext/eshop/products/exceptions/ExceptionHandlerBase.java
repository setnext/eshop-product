package com.setnext.eshop.products.exceptions;


import java.time.LocalDateTime;
import java.util.ArrayList;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionHandlerBase extends ResponseEntityExceptionHandler {
	ArrayList<String> er;

	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionDetails> handleAllExceptions(Exception ex, WebRequest request) throws Exception {
		ExceptionDetails errorDetails = new ExceptionDetails(LocalDateTime.now(),
				ex.getMessage(), request.getDescription(false));

		System.out.println(ex.getMessage());

		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);

	}

	@ExceptionHandler(ProductNotFoundException.class)
	public final ResponseEntity<ExceptionDetails> handleUserNotFoundException(Exception ex, WebRequest request) throws Exception {
		ExceptionDetails errorDetails = new ExceptionDetails(LocalDateTime.now(),
				ex.getMessage(), request.getDescription(false));

		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);

	}
	

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(
			MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {

//		ExceptionDetails errorDetails = new ExceptionDetails(LocalDateTime.now(),
//				ex.getFieldError().getDefaultMessage(), request.getDescription(false));
		
		System.out.println("field errors");
		er =new ArrayList<>();
//
		ex.getFieldErrors().forEach((n) ->{
			System.out.println(n.getDefaultMessage());
			er.add(n.getDefaultMessage());
		});
		ExceptionDetails errorDetails = new ExceptionDetails(LocalDateTime.now(),
				er.toString(), request.getDescription(false));




		return new ResponseEntity(errorDetails, HttpStatus.BAD_REQUEST);
	}

}
