package uncheckedException1;

public class MarriageException extends ArithmeticException
{
 private String message;

public MarriageException(String message) {
	
	this.message = message;
}
public String getMessage()
{
 return message;	
}
 
}
