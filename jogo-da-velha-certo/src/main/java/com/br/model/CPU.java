package com.br.model;

import java.util.Random;

import com.br.interfacejogo.InterfaceJogo;

public class CPU implements InterfaceJogo{
	
	//Atributos da classe
	private String dificuldade;
	private int pontuacao;
	private String escolha;
	
	//M�todo de jogada da m�quina
	public String [] [] fazerJogada(String [] [] tabuleiro, String dificuldade){
		if (dificuldade.equals("facil")) {
			tabuleiro = jogadaFacil(tabuleiro);
		} else if (dificuldade.equals("medio")) {
			tabuleiro = jogadaMedia(tabuleiro);
		}
	}
	
	//Jogada da M�quina se escolhido o nivel f�cil
	private String [] [] jogadaFacil (String [] [] tabuleiro){
		boolean inserir = false;
		while (inserir == false) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (tabuleiro [i] [j].isEmpty()) {
						tabuleiro [i] [j] = this.escolha;
						inserir = true;
						break;
					} else {
						continue;
					}
				}
			}
		}
		return tabuleiro;
	}
	
	//Jogada da m�quina se for escolhido o nivel m�dio
	private String [] [] jogadaMedia(String [] [] tabuleiro){
		Random gerador = new Random();
		boolean inserir = false;
		while (inserir == false) {
			int casasDisponiveis = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (tabuleiro [i] [j].isEmpty()) {
						casasDisponiveis ++;
					}
				}
			}
			if (casasDisponiveis > 4) {
				int linha = gerador.nextInt(2);
				int coluna = gerador.nextInt(2);
				if (tabuleiro [linha] [coluna].isEmpty()) {
					tabuleiro [linha] [coluna] = escolha;
					System.out.println("A CPU escolheu a posi��o " + (linha + 1) + "X" + (coluna + 1) + " para marcar um " + this.escolha);
					inserir = true;
				} else {
					System.out.println("A CPU ainda est� escolhendo sua jogada!");
				}
			} else {
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if (tabuleiro [i] [j].isEmpty()) {
							tabuleiro [i] [j] = this.escolha;
							inserir = true;
						} else {
							continue;
						}
					}
				}
			}
		}
		return tabuleiro;
	}
	
	//Setters e Getters
	public String getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(String dificuldade) {
		this.dificuldade = dificuldade;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getEscolha() {
		return escolha;
	}

	public void setEscolha(String escolha) {
		this.escolha = escolha;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dificuldade == null) ? 0 : dificuldade.hashCode());
		result = prime * result + ((escolha == null) ? 0 : escolha.hashCode());
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
		CPU other = (CPU) obj;
		if (dificuldade == null) {
			if (other.dificuldade != null)
				return false;
		} else if (!dificuldade.equals(other.dificuldade))
			return false;
		if (escolha == null) {
			if (other.escolha != null)
				return false;
		} else if (!escolha.equals(other.escolha))
			return false;
		if (pontuacao != other.pontuacao)
			return false;
		return true;
	}
	
}