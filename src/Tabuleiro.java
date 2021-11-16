
public class Tabuleiro {
	private int linhas;
	private int colunas;
	private Peca [][] pecas;
	
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			throw new ExcecaoTabuleiro ("Erro ao criar tabuleiro: deve haver pelo menos 1 linha e 1 coluna");
		}
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Peca [linhas] [colunas];
}

	public int getLinhas() {
		return linhas;
	}

	public int getColunas() {
		return colunas;
	}
	
	public Peca pecas (int linha, int coluna) {
		if (!posicaoExistente (linha, coluna)){
			throw new ExcecaoTabuleiro ("Posicao nao existe no tabuleiro");
		}
		return pecas [linha][coluna];
	}
	public Peca peca (Posicao posicao) {
		if (!posicaoExistente (posicao)){
			throw new ExcecaoTabuleiro ("Posicao nao existe no tabuleiro");
	}
		return pecas [posicao.getLinha()] [posicao.getColuna()];
	}
	
	public void colocarPeca (Peca peca, Posicao posicao) {
		if (temPeca (posicao)) {
			throw new ExcecaoTabuleiro ("já existe uma peça na posição" + posicao);
		}
		pecas [posicao.getLinha()] [posicao.getColuna()] = peca;
		peca.posicao = posicao;
	}
	private boolean posicaoExistente (int linha, int coluna) {
		return linha >= 0 && linha < linha && coluna >=0 && coluna < coluna;
	}
	
	public boolean posicaoExistente (Posicao posicao) {
		return posicaoExistente(posicao.getLinha(), posicao.getColuna());
	}
	
	public boolean temPeca (Posicao posicao) {
		if (!posicaoExistente (posicao)){
		throw new ExcecaoTabuleiro ("Posicao nao existe no tabuleiro");
		}
		return peca (posicao) != null;	
	}
	}
