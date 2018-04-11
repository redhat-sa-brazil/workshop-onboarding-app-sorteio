package org.mycompany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Aluno {
	
	private String nome;
	private boolean sorteado;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isSorteado() {
		return sorteado;
	}
	public void setSorteado(boolean sorteado) {
		this.sorteado = sorteado;
	}
	
	
}
