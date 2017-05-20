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
	
	public Profil(Long idProfil, String nom, String prenom, Date dateNaiss, String ville, String etablissement,
			String promo, String mail) {
		super();
		this.idProfil = idProfil;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.ville = ville;
		this.etablissement = etablissement;
		this.promo = promo;
		this.mail = mail;
	}
	
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
	
	@Override
	public String toString() {
		return "Profil [idProfil=" + idProfil + ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss
				+ ", ville=" + ville + ", etablissement=" + etablissement + ", promo=" + promo + ", mail=" + mail + "]";
	}

}
