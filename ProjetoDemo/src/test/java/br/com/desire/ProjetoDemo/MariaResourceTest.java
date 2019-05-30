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
	List<String> arrayDoRepo;
	
	@Before
	public void setUp() {
		 repo = new Mariadepository();
		 array = new ArrayList<>();
	}
	
	@Test
	public void getMariasTest() {
		arrayDoRepo.add(null);
		assertEquals(array, arrayDoRepo);
	}

}
