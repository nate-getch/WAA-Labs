package mum.edu;

public class CustomHandlerException extends RuntimeException {

	private static final long serialVersionUID = 9060751397339719682L;
	private String message = "Product Not Found for this ID ";
	
 	public CustomHandlerException() {}
	
	public CustomHandlerException(String message) {
		this.message = message;
		
	}
	
	public String getMessage() {
		return message;
	}

}
