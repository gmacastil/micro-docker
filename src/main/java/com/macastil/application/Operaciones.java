package com.macastil.application;

import com.macastil.domain.Pesos;

public class Operaciones {
	
	public Pesos getPesos(int dolares, int trm) {
		Pesos p = new Pesos();
		p.setCantidad(dolares);
		p.setResultado(trm* dolares);
		return p;
	}

}
