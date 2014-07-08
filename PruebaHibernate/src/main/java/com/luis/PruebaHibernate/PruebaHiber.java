package com.luis.PruebaHibernate;

import java.util.List;

import modelo.Puesto;
import repositorio.RepositorioPuestos;

public class PruebaHiber {

	public static void main(String[] args) {
	RepositorioPuestos rp=new RepositorioPuestos();
	
	List<Puesto> l=rp.get();
	
	for (Puesto puesto : l) {
		System.out.println(puesto.getNombre());
	}

	}

}
