package com.web;

import java.awt.print.Printable;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.model.Profil;
import com.model.Service;

@Controller
public class JpaProjetWebService {

	// Ajout Profil
	@RequestMapping(value = "/profil", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.OK)
	public void creerProfil(@RequestBody Profil profil, HttpServletRequest request) {
		System.out.println("creerProfil: " + profil);
		String nom = (String) request.getParameter("nom");
		String prenom = (String) request.getParameter("prenom");
		String mail = (String) request.getParameter("mail");
		String ville = (String) request.getParameter("ville");
		String etablissement = (String) request.getParameter("etablissement");
		String promo = (String) request.getParameter("promo");
		
		if (nom != null && prenom != null && mail != null) {
		profil.setPrenom(prenom);
		profil.setMail(mail);
		profil.setNom(nom);
		try  {
			profil.setVille(ville);
			profil.setEtablissement(etablissement);
			profil.setPromo(promo);
			}catch (Exception e) {
				System.out.print("Erreur : " + e);
			}
		profil.ajouterProfil(profil);
		}

		else {
			System.out.println("Vous devez entrer un prenom, nom et mail obligatoirement");
		}
	
	}

	//Modifier profil
	@RequestMapping(value = "/profil", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	public void modifierProfil(@RequestBody Profil profil) {
		System.out.println("modifierProfil: " + profil);
	}

	@RequestMapping(value = "/profil/{idProfil}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.OK)
	public void supprimerProfil(@PathVariable(value = "idProfil") String idProfil) {
		System.out.println("supprimerProfil: " + idProfil);
	}

	@RequestMapping(value = "/profil/{idProfil}", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public void obtenirProfil(@PathVariable(value = "idProfil") String idProfil) {
		
	}

	@RequestMapping(value = "/profil", method = RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody
	public List<Profil> obtenirListeProfil() {
		List<Profil> listes = new ArrayList<Profil>();
		return listes;
	}

}
