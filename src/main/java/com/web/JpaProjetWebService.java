package com.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.server.JpaProjetControlleur;

@RestController
public class JpaProjetWebService {

	@Autowired
	JpaProjetControlleur jpaProjetControlleur;
	
}
