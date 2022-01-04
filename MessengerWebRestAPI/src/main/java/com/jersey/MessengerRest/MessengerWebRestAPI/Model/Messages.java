package com.jersey.MessengerRest.MessengerWebRestAPI.Model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messages {

	private long messageId;
	private String message;
	private String author;
	private Date created;

	public Messages() {
	}

	public Messages(long messageId, String message, String author) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.author = author;
		created = new Date();
	}

	public long getMessageId() {
		return messageId;
	}

	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

}
