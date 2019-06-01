package br.com.desire.ProjetoDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MariadepositoryTest {
	// já vem com lista embutida
	Mariadepository repo = new Mariadepository();
	Maria m1, m2, m3, m4;
	
	@Before
	public void setUp() {
		m1 = new Maria(1,"Maria",200);
		m2 = new Maria(2,"Fulaninha",900);
		m3 = new Maria(3,"Suzaninha",8);
		try {
			repo.create(m1);
			repo.create(m2);
			repo.create(m3);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@Test
	public void apagaJogadorByIDTest() {
		repo.apagaJogadorByID(2);
		assertEquals(2, repo.getMarias().size());
	}
	
	@After
	public void tearDown() {
		for (Maria maria : repo.getMarias()) {
			System.out.println(maria.getNome());
		}

	}

}
