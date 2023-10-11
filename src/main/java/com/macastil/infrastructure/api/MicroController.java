package com.macastil.infrastructure.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.macastil.application.Operaciones;
import com.macastil.domain.Pesos;

@RestController
public class MicroController {
	
	@Value("${trm}")
	private int trm;
	
	private static final Logger log = LoggerFactory.getLogger(MicroController.class);

	@GetMapping("/dolares/{dolares}")
	public Pesos getPesos(@PathVariable int dolares) {
		Operaciones op =new Operaciones();
		Pesos p = op.getPesos(dolares, trm);
		//System.out.println("{ 'dolares' :'"+ dolares + "','resultado': " + p.getResultado() + "'}");
		log.info("dolares: " + dolares);
		return p;
	}

}
