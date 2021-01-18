package com.br.model;

public class Jogador {
	
	//Atributos da classe
	private String nome;
	private String escolha;
	private int pontuacao;
	
	//Setters e Getters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEscolha() {
		return escolha;
	}
	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((escolha == null) ? 0 : escolha.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + pontuacao;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (escolha == null) {
			if (other.escolha != null)
				return false;
		} else if (!escolha.equals(other.escolha))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pontuacao != other.pontuacao)
			return false;
		return true;
	}

}
