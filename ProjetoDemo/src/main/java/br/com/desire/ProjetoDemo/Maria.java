package br.com.desire.ProjetoDemo;

import javax.xml.bind.annotation.XmlRootElement;

// retornar elemento no formato XML
@XmlRootElement
public class Maria {
	private Integer ID;
	private String nome;
	private int pontos;
	
	// Construtor default
	public Maria() {
		// TODO Auto-generated constructor stub
	}
	
	// Construtor + parâmetros
	public Maria(Integer ID, String nome, int pontos) {
		this.ID = ID;
		this.nome = nome;
		this.pontos = pontos;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	@Override
	public String  toString() {
		return "Maria [id=" +ID + ", nome =  " +nome +", pontos =" +pontos +"]";
	}
}
