package br.com.desire.ProjetoDemo;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MariaResourceTest {
	
	Mariadepository repo;
	// Array
	List<Maria> array;
	List<Maria> arrayDoRepo;
	
	@Before
	public void setUp() {
		 repo = new Mariadepository();
		 array = new ArrayList<>();
	}
	
	@Test
	public void getMariasTest() {
		arrayDoRepo = repo.getMarias();
		assertEquals(array, arrayDoRepo);
	}

}
