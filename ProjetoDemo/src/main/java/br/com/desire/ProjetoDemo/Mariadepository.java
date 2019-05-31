package br.com.desire.ProjetoDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.google.gson.Gson;

public class Mariadepository {
	private static List<Maria> marias;
	private String mj;

	// Construtor de Mariadepository recebe a instância de ArrayList
	public Mariadepository() {
		marias = new ArrayList<>();	

		// apenas para testar com elementos na lista
		// (quando recriamos a lista, ela é preenchida automaticamente)
		Maria maria = new Maria(2,"Maria maria", 300);
		Maria marya = new Maria(4,"Joana",222);
		Maria moara = new Maria(8,"Emengarda",333);
		create(maria);
		create(marya);
		create(moara);
	}

	// listar todas as Marias
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<Maria> getMarias(){
//		return new Gson().toJson(marias);
		Collections.sort(marias, new Comparator() {
			public int compare(Object m1, Object m2) {
				Maria ma1 = (Maria) m1;
				Maria ma2 = (Maria) m2;
				return Integer.compare(ma1.getID(), ma2.getID());
			}
		});
		return marias;
	}

	// get Maria by ID
	public Maria getMaria(int id){
		for(Maria a: marias) {
			System.out.println("Maria na fila, com ID " + a.getID() + " --> " + a);
			if (a.getID() == id) {
				return a;
			}
		}

		return new Maria();
	}

	// criar Maria
	public void create(Maria a) {
		marias.add(a);
	}
	
	// editar by ID
	public void edit(Maria a, int id) {
		// TODO Auto-generated method stub
		System.out.println("editar");
	}

	// apaga Maria por meio do ID
	public void apagaJogadorByID(int id) {
		System.out.println("apagar jogador com ID: " + id);
		marias.remove(id);
	}
	
	// apaga todos os jogadores da lista
	public boolean apagaJogadores() {
		System.out.println("apagar toda a lista de jogadores!!");
		boolean apagou = false;
		apagou = marias.removeAll(marias);
		
		for(int i = 0; i < marias.size(); i++) {
			System.out.println("O que tem em marias?!? " + marias.get(i));
		}
		
		return apagou;
	}

}
