package xadrez;

import tabuleiro.Posicao;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

public class PartidaDeXadrez {
	private Tabuleiro tabuleiro;

	public PartidaDeXadrez() {
		tabuleiro = new Tabuleiro(8, 8);
		setupInicial();
	}

	public PecaDeXadrez[][] getPecas() {
		PecaDeXadrez[][] mat = new PecaDeXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
		for (int i = 0; i < tabuleiro.getLinhas(); i++) {
			for (int j = 0; j < tabuleiro.getColunas(); j++) {
				mat[i][j] = (PecaDeXadrez) tabuleiro.peca(i, j);
			}
		}
		return mat;
	}

	/**
	 * Método responsável por iniciar a partida de xadrez
	 */
	private void setupInicial() {
		tabuleiro.posicaoDaPeca(new Torre(tabuleiro,Cor.Branco), new Posicao(2,1));
		tabuleiro.posicaoDaPeca(new Rei (tabuleiro, Cor.Preto), new Posicao(0,4));
		tabuleiro.posicaoDaPeca(new Rei (tabuleiro, Cor.Branco), new Posicao(7,4));
	}

}
