package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.stereotype.Component;

@Entity
public class ProfilAdmin {
	
	@Column(name = "RIGHTS")
	private String droits;

	public String getDroits() {
		return droits;
	}

	public void setDroits(String droits) {
		this.droits = droits;
	}
}
