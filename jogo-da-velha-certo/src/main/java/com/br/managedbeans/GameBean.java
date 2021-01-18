package com.br.managedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.br.model.CPU;
import com.br.model.Jogador;
import com.br.model.Tabuleiro;

@ViewScoped
@ManagedBean (name = "gameBean")
public class GameBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	//Classes que serão utilizadas durante o jogo
	private Jogador jogador = new Jogador();
	private CPU cpu = new CPU();
	private Tabuleiro tabuleiro = new Tabuleiro();
	//Nova modificação
	
	//Métodos de gerenciamento do jogo
	

}
