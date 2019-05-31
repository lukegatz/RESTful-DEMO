package br.com.desire.ProjetoDemo;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
// nome do recurso
@Path("/jogadores")
public class MariaResource {
	private static Mariadepository repo = new Mariadepository();
	// Array de String (volta em Json)
	List<String> mariaStr = new ArrayList<>();

	// TESTE: está funcionando?
	@GET
	@Path("its-alive")
	@Produces(MediaType.TEXT_PLAIN)
	public String getWebservice() {
		return "Web service funcionando!";
	}
	
	// TESTE: está funcionando com JSON?
	// (Jogue esse método no lugar certo -- depository)
	@GET
	@Path("json")
	@Produces(MediaType.APPLICATION_JSON)
	public String getWebserviceJSON() {
		// Teste básico
		Maria maria = new Maria(2,"Maria maria", 300);
		repo.create(maria);
		mariaStr.add(repo.getMarias().toString());
		return new Gson().toJson(mariaStr);
	}

	// tipo de operação e de qual forma deve apresentar o resultado
	// Lista todas as Marias >>>
	@GET
	@Path("lista")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,}) // produzir no formato XML
	public List<Maria> getMarias() {
		System.out.println("getMarias Calling....");
		return repo.getMarias();
	}
	
	// Retorna Maria by ID
	@GET
	@Path("lista/{id}") //id é passado com parametro no URI do recurso
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON}) // produzir no formato XML ou JSON
	public Maria getMaria(@PathParam("id") int id) { // reconhecer que id é um parametro
		System.out.println("getMaria Calling....");
		return repo.getMaria(id);
	}
	
	// Cria uma nova Maria (e adiciona à lista)
	@POST
	@Path("criar/{id}/{nome}/{pontos}")
	@Produces({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON,})
//	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Maria createMaria(@PathParam("id") int id, 
			@PathParam("nome") String nome, @PathParam("pontos") int pontos, Maria mary) {
		System.out.println(mary);
		mary = new Maria(id, nome, pontos);
		repo.create(mary);
		return mary;
	}

	@PUT
	@Path("edita/{id}") //id é passado com parametro no URI do recurso
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
	@Path("deleta")
	@Produces(MediaType.TEXT_PLAIN) // produzir no formato XML ou JSON
	public String deleteAll() { 
		String msg= "";
		boolean delete = 
				repo.apagaJogadores();
//		repo.marias.clear();	// limpa a lista DE NOVO!!
		msg = "lista apagada? " + delete;
		return msg;
	}
	
	@DELETE
	@Path("jogador/deleta/{id}") //id é passado com parametro no URI do recurso
	//@Produces(MediaType.APPLICATION_XML) // produzir no formato XML
	@Produces(MediaType.TEXT_PLAIN) // produzir no formato XML ou JSON
	public String delete(@PathParam("id") int id) { // reconhecer que id é um parametro
		String msg= "";
		repo.apagaJogadorByID(id);
		msg = "removido com sucesso";
		return msg;
	}
}
