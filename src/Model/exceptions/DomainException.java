package Model.exceptions;

public class DomainException  extends Exception{

	private static final long serialVersionUID = 1L;
	
	public DomainException(Throwable msg) {
		
		super(msg);
		
	}
	
	public  DomainException(String msg) {
		
		super(msg);
	}
}
