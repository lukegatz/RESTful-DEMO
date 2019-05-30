package br.com.desire.ProjetoDemo;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class Mariadepository {
	List<Maria> marias;
	
	// Construtor de Mariadepository recebe a instância de ArrayList
	public Mariadepository() {
		marias = new ArrayList<>();	
	}
	
	// listar todas as Marias
	public String getMarias(){
		return new Gson().toJson(marias);
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
		marias.add(a);
	}

	public void edit(Maria a, int id) {
		// TODO Auto-generated method stub
		System.out.println("editar");
	}
	
	// apaga Maria por meio do ID
	public void apagaJogadorByID(int id) {
		System.out.println("apagar jogador com ID: " + id);
		marias.remove(id);
	}
	
	public void apagaJogadores() {
		System.out.println("apagar toda a lista de jogadores!!");
		marias.clear();
	}

}
