package mum.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import mum.edu.domain.dto.DomainError;
import mum.edu.domain.dto.DomainErrors;

@ControllerAdvice
public class ExceptionController {

	@Autowired
	MessageSourceAccessor messageAccessor;

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public DomainErrors handleException(MethodArgumentNotValidException exception) {
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();

		DomainErrors errors = new DomainErrors();
		errors.setErrorType("ValidationError");
		for (FieldError fieldError : fieldErrors) {
			DomainError error = new DomainError(messageAccessor.getMessage(fieldError));
			errors.addError(error);
		}

		return errors;
	}

}