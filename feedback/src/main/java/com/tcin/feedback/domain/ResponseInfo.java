package com.tcin.feedback.domain;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
public class ResponseInfo {
	private String detail;
	private Long timeStamp;
	private String message;

	public ResponseInfo(String detail, Long timeStamp, String message) {
		super();
		this.detail = detail;
		this.timeStamp = timeStamp;
		this.message = message;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String toString() {
		return this.detail + ":" + this.timeStamp + ":" + this.message;
	}

}
