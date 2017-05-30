package com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class ProfilAdmin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_ADMIN")
	private Long idAdmin;
	@Column(name = "ID_PROFIL")
	private Long idProfil;
	@Column(name = "RIGHTS")
	private String droits;

	public String getDroits() {
		return droits;
	}

	public void setDroits(String droits) {
		this.droits = droits;
	}
}
