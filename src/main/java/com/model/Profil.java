package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
public class Profil {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID_PROFIL")
	private Long idProfil;
	@Column(name = "PROFIL_SURNAME")
	private String nom;
	@Column(name = "PROFIL_NAME")
	private String prenom;
	@Column(name = "PROFIL_DOB")
	private Date dateNaiss;
	@Column(name = "PROFIL_CITY")
	private String ville;
	@Column(name = "PROFIL_UNIV")
	private String etablissement;
	@Column(name = "PROFIL_YEAR")
	private String promo;
	@Column(name = "PROFIL_EMAIL")
	private String mail;
	
	public Long getIdProfil() {
		return idProfil;
	}
	public void setIdProfil(Long idProfil) {
		this.idProfil = idProfil;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getEtablissement() {
		return etablissement;
	}
	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}
	public String getPromo() {
		return promo;
	}
	public void setPromo(String promo) {
		this.promo = promo;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}

}
