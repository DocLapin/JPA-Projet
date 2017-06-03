package com.web;

import java.util.ArrayList;
import java.util.List;

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
	public void creerProfil(@RequestBody Profil profil) {
		System.out.println("creerProfil: " + profil);
		profil.ajouterProfil(profil);
	}

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
