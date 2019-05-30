package br.com.desire.ProjetoDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestaMaria {

	public static void main(String[] args) {
		List<Maria> array = new ArrayList<>();
		Mariadepository repo = new Mariadepository();
		// implementações do ArrayList
		Maria e = new Maria(1, "Maria", 200);
//		array.add(e);	// adiciona uma Maria [CRIAR]
		
		repo.create(e);					// incluir uma Maria
		array = repo.getMarias();
		Iterator<Maria> it = array.iterator();
		
		// Listar todas as Marias
		for (Maria maria : array) {
			System.out.println(maria);
		}
		
//		array.clear();	// limpa toda a lista de Marias [DELETAR TODAS AS MARIAS]
//		array.add(0, e);// adiciona uma Maria no index 'n'  [ADD BY ID]
//		array.get(0);	// getByID  [CONSULTA BY ID]
//		array.listIterator(); 	// serve um foreach tb [lista todos]
//		array.remove(0);		// remove uma Maria by ID
//		array.set(0, e);		// edita uma Maria

	}

}
