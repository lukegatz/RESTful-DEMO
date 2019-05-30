package br.com.desire.ProjetoDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
// nome do recurso
@Path("marias")
public class MariaResource {
	Mariadepository repo = new Mariadepository();
	// Array
	List<Maria> array = new ArrayList<>();
	// implementações do ArrayList
	public String metodos(){
		Maria e = new Maria();
		array.add(e);	// adiciona uma Maria
		array.clear();	// limpa toda a lista de Marias
		array.add(0, e);// adiciona uma Maria no index 'n'
		array.get(0);	// getByID
		return "oi";
	}

	// tipo de operação e de qual forma deve apresentar o resultado
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML}) // produzir no formato XML
	public List<Maria> getMarias() {
		System.out.println("getMarias Calling....");

		return repo.getMarias();
	}

	@GET
	@Path("maria/{id}") //id é passado com parametro no URI do recurso
	//@Produces(MediaType.APPLICATION_XML) // produzir no formato XML
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) // produzir no formato XML ou JSON
	public Maria getMaria(@PathParam("id") int id) { // reconhecer que id é um parametro
		System.out.println("getMaria Calling....");

		return repo.getMaria(id);
	}

	@POST
	@Path("maria")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Maria createMaria(Maria a) {
		System.out.println(a);;
		repo.create(a);
		return a;

	}

	@POST
	@Path("jogador/edita/{id}") //id é passado com parametro no URI do recurso
	//@Produces(MediaType.APPLICATION_XML) // produzir no formato XML
	@Produces(MediaType.TEXT_PLAIN) // produzir no formato XML ou JSON
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public String edita(Maria a, @PathParam("id") int id) { // reconhecer que id é um parametro
		String msg= "";
		System.out.println(a.getID());
		repo.edit(a,id);
		msg = "editado com sucesso";
		return msg;
	}

	@DELETE
	@Path("jogador/deleta/{id}") //id é passado com parametro no URI do recurso
	//@Produces(MediaType.APPLICATION_XML) // produzir no formato XML
	@Produces(MediaType.TEXT_PLAIN) // produzir no formato XML ou JSON
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public String delete(Maria a, @PathParam("id") int id) { // reconhecer que id é um parametro
		String msg= "";
		repo.deletejogador(id);
		msg = "removido com sucesso";
		return msg;
	}
}
