package br.com.desire.ProjetoDemo;

import javax.xml.bind.annotation.XmlRootElement;

// retornar elemento no formato XML
@XmlRootElement
public class Maria {
private int ID;
private String nome;
private int pontos;
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
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
@Override
public String  toString() {
	return "Maria [id=" +ID + ", nome =  " +nome +", pontos =" +pontos +"]";
}
}
