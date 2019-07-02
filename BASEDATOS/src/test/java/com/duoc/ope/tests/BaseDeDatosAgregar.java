package com.duoc.ope.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

 
import com.duoc.ope.base.BaseDeDatos;
import com.duoc.ope.dato.Dato;

 

public class BaseDeDatosAgregar {

	private BaseDeDatos base;
	
	
	@Before
	public void setUp() throws Exception {
		this.base = new BaseDeDatos();
	}

	@Test
	public void test() {
		this.base.agregar(new Dato("A1","Datos ingresados 1"));
		this.base.agregar(new Dato("A2","Datos ingresados 2"));
		this.base.agregar(new Dato("A3","Datos ingresados 3"));
		this.base.agregar(new Dato("A4","Datos ingresados 4"));
		this.base.agregar(new Dato("A5","Datos ingresados 5"));
//		int largo = this.base.listar().size();
	}
	
	@Test
	public void cuandoAgrega1entoncesTrue() {
		boolean retorno = this.base.agregar(new Dato("A6","Datos ingresados 6"));
		assertTrue(retorno);
	}
	
	@Test
	public void cuandoAgrega1entoncesListazise0() {
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero deberia ser 0", largo == 0);
	}
	
	 
	@Test
	public void cuandoAgrega1entoncesListazise1() {
		this.base.agregar(new Dato("A6","Datos ingresados 6"));
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero deberia ser 0", largo == 1);
	}
	
}
