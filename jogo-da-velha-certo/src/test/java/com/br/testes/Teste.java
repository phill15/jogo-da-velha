package com.br.testes;

import org.junit.jupiter.api.Test;
import javax.swing.JOptionPane;

import com.br.model.CPU;
import com.br.model.Jogador;
import com.br.model.Tabuleiro;

class Teste {

	@Test
	void testeTabuleiro() {
		Tabuleiro tabuleiro = new Tabuleiro();
		Jogador jogador = new Jogador();
		CPU cpu = new CPU();
		jogador.setNome("Luiz");
		jogador.setEscolha("X");
		jogador.setPontuacao(0);
		cpu.setEscolha("O");
		cpu.setPontuacao(0);
		String dificuldade = JOptionPane.showInputDialog("Escolha a dificuldade da CPU: facil, medio");
		cpu.setDificuldade(dificuldade);
		System.out.println("Iniciar Jogo");
		while (true) {
			//Vez do Jogador
			tabuleiro.setTabuleiro(jogador.fazerJogada(tabuleiro.getTabuleiro()));
			//Exibe no console as marca��es do tabuleiro
			tabuleiro.exibeTabuleiro();
			if (tabuleiro.finalizarJogo(jogador.getEscolha())) {
				System.out.println("O jogador " + jogador.getNome() + " venceu a partida!");
				break;
			}
			//Verifica se um empate ocorreu ap�s a jogada do jogador
			if (tabuleiro.verificaEmpate()) {
				System.out.println("Empate, ningu�m conseguiu marcar ponto");
				break;
			}
			//Vez da m�quina
			tabuleiro.setTabuleiro(cpu.fazerJogada(tabuleiro.getTabuleiro()));
			//Exibe no console as marca��es do tabuleiro
			tabuleiro.exibeTabuleiro();
			if (tabuleiro.finalizarJogo(cpu.getEscolha())) {
				System.out.println("Oh n�o... A CPU venceu a partida! Tente novamente");
				break;
			}
			//Verifica se um empate ocorreu ap�s a jogada da m�quina
			if (tabuleiro.verificaEmpate()) {
				System.out.println("Empate, ningu�m conseguiu marcar ponto");
				break;
			}
		}	
	}
}


