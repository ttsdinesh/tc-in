package com.tcin.feedback.exception;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
public class ObjectionalContentException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String objectionalWord;

	public String getObjectionalWord() {
		return this.objectionalWord;
	}

	public void setObjectionalWord(String objectionalWord) {
		this.objectionalWord = objectionalWord;
	}

	public ObjectionalContentException() {
		super();
	}

	public ObjectionalContentException(String message) {
		super(message);
		this.objectionalWord = message;
	}

	public ObjectionalContentException(Throwable cause) {
		super(cause);
	}

}
