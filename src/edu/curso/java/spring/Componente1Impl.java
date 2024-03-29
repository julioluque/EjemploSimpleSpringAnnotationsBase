package edu.curso.java.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Componente1Impl implements Componente1 {

	private String texto;
	
//	@Autowired
	private Componente2 componente2;

	public Componente1Impl() {
		System.out.println("Comp1Impl >>>>>> Creando componente 1");
	}

	public void mostrarT() {
		System.out.println("t1 = " + texto);
		System.out.println("t2 = " + componente2.getTexto());

	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		System.out.println("Comp1Impl >>>>>> Seteando texto: " + texto);
		this.texto = texto;
	}

	public Componente2 getComponente2() {
		return componente2;
	}

	public void setComponente2(Componente2 componente2) {
		System.out.println("Comp1Impl >>>>>> Asignando componente2");
		this.componente2 = componente2;
	}

}
