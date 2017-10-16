package mum.edu;

public class CustomResponseStatusException extends RuntimeException {
	private String message;
	CustomResponseStatusException( String message){
		this.message = message;
	}
	
}
