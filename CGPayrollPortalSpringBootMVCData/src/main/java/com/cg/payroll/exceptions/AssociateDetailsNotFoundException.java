package com.cg.payroll.exceptions;

public class AssociateDetailsNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public AssociateDetailsNotFoundException() {
		super();
	}

	public AssociateDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AssociateDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AssociateDetailsNotFoundException(String message) {
		super(message);
	}

	public AssociateDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
