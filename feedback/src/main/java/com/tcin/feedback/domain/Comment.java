package com.tcin.feedback.domain;

import java.io.Serializable;

/**
 * @author Dinesh Thangaraj
 *
 *         Created on 19-May-2018
 */
public class Comment implements Serializable {

	public Comment() {

	}

	public Comment(String comment, String userId, long timeStamp) {
		super();
		this.comment = comment;
		this.userId = userId;
		this.timeStamp = timeStamp;
	}

	private static final long serialVersionUID = 1L;
	private String comment;
	private String userId;
	private long timeStamp;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String toString() {
		return this.comment + ":" + this.userId + ":" + this.timeStamp;
	}

}
