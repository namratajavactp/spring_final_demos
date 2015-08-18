package net.javabeat.spring.articles.txn.ticbook.annotation.rollback;

public class InsufficientFundsException extends RuntimeException{

	/**
	 * Default serial version UID
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsException(String message){
		super(message);
	}
}
