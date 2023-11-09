package tabuleiro;

/**
 * Piece
 */
public class Peca {
	protected Posicao posicao;
	private Tabuleiro tabuleiro;

	public Peca() {
	}

	public Peca(Tabuleiro tabuleiro) {
		super();
		this.tabuleiro = tabuleiro;
		posicao = null;
	}

	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

}
