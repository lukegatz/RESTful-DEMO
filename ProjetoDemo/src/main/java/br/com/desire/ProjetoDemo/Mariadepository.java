package br.com.desire.ProjetoDemo;

import java.util.ArrayList;
import java.util.List;

public class Mariadepository {
	List<Maria> marias;
	
	public Mariadepository() {
		marias = new ArrayList<>();	
		Maria a1 = new  Maria();
		a1.setID(101);
		a1.setNome("Maria");
		a1.setPontos(10);
		Maria a2 = new  Maria();
		a2.setID(102);
		a2.setNome("GIL");
		a2.setPontos(10);
		Maria a3 = new  Maria();
		a3.setID(103);
		a3.setNome("Conte");
		a3.setPontos(11);
		marias.add(a1);
		marias.add(a2);
		marias.add(a3);
	}
	
	// listar todas as Marias
	public List<Maria> getMarias(){
		return marias;
	}
	
	// get Maria by ID
	public Maria getMaria(int id){
		for(Maria a: marias) {
			if (a.getID()==id) 
				return a;
		}

		return new Maria();
	}
	
	// criar Maria
	public void create(Maria a) {
		// TODO Auto-generated method stub
		marias.add(a);
	}

	public void edit(Maria a, int id) {
		// TODO Auto-generated method stub
		System.out.println("editar");
	}

	public void deletejogador(int id) {
		// TODO Auto-generated method stub
		System.out.println("apagar");
	}

}
