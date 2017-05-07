package com.model;

import javax.persistence.Column;

import org.springframework.stereotype.Component;

@Component
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
