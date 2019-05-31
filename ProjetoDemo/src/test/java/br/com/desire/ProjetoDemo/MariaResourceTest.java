package br.com.desire.ProjetoDemo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MariaResourceTest {
	
	static Mariadepository repo;
	// Array
	List<Maria> array;
	Maria m1, m2, m3, m4;
	MariaResource instancia;
	
	@Before
	public void setUp() {
		 repo = new Mariadepository();
		 instancia = new MariaResource();
		 array = new ArrayList<>();
		 m1 = new Maria(1,"Maria",200);
		 m2 = new Maria(2,"Joana",333);
		 m3 = new Maria(4,"Bubu",444);
		 m4 = new Maria();
		 // preenche a lista
		 array.add(m1);
		 array.add(m2);
		 array.add(m3);
	}
	
	@Test
	public void getMariasTest() {
		int tamanho = array.size();
		assertEquals(tamanho, 3);
	}
	
	public void createMariaTest() {
		m4 = instancia.createMaria(6, "Penny penny penny", 2000, m4);
	}

}
