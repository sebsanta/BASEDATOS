package com.duoc.ope.tests;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import com.duoc.ope.base.BaseDeDatos;
import com.duoc.ope.dato.Dato;

 

public class BaseDeDatosEliminar {

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
	public void test() {
		
	}
	
	@Test
	public void cuandoEliminamos1Entontes4() {
		this.base.eliminar("A1");
		int largo = this.base.listar().size();
		assertTrue("Es " + largo + " pero deberia ser 4 ", largo == 4);
	}

	@Test
	public void cuandoEliminamos1EntontesTrue() {
		boolean respuesta = this.base.eliminar("A1");
		assertTrue(respuesta);
	}
	
	@Test
	public void cuandoEliminamos1QueNoExisteEntontesFalse() {
		boolean respuesta = this.base.eliminar("A7");
		assertFalse(respuesta);
	}
	
	
	
}
