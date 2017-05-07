package com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_MESSAGE")
	private long idMessage;
	@Column(name = "FK_ID_EXP")
	private long idExp;
	@Column(name = "FK_ID_DEST")
	private long idDest;
	@Column(name = "MESSAGE")
	private String message;
	@Column(name = "MSG_DATE")
	private Date date;
	
	public Message() {
		super();
	}
	
	public long getIdMessage() {
		return idMessage;
	}
	public void setIdMessage(long idMessage) {
		this.idMessage = idMessage;
	}
	public long getIdExp() {
		return idExp;
	}
	public void setIdExp(long idExp) {
		this.idExp = idExp;
	}
	public long getIdDest() {
		return idDest;
	}
	public void setIdDest(long idDest) {
		this.idDest = idDest;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

}
