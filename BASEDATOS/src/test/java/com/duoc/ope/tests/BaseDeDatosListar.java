package com.duoc.ope.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.duoc.ope.base.BaseDeDatos;
import com.duoc.ope.dato.Dato;

public class BaseDeDatosListar {

	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
		this.base.agregar(new Dato("A1","Datos ingresados 1"));
		this.base.agregar(new Dato("A2","Datos ingresados 2"));
		this.base.agregar(new Dato("A3","Datos ingresados 3"));
		this.base.agregar(new Dato("A4","Datos ingresados 4"));
		this.base.agregar(new Dato("A5","Datos ingresados 5"));
	}

	
	@Test
	public void losListaAtodos() {
		ArrayList<Dato> resultado = this.base.listar();
		int largo = resultado.size();
		assertTrue("Es " + largo + " pero deberia ser 5", largo == 5);
	}
	
	
	
 
	
	
	

}
