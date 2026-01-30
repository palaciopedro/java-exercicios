package model.exceptions;

public class InsufficientLimitException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InsufficientLimitException(String msg) {
		super(msg);
	}
}
