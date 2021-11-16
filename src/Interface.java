
public class Interface {
	public static void impressaoTabuleiro (PecaXadrez [][] pecas) {
		for (int i=0; i <pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j=0; j<pecas.length; j++) {
				impressaoPeca (pecas [i][j]);
			}
			System.out.println ();
		}
		System.out.println ("  a b c d e f g h");
	}
	
	private static void impressaoPeca (PecaXadrez peca) {
		if (peca == null) {
			System.out.print("-");	
		}
		else {
			System.out.print(peca);
		}
		System.out.print(" ");
	}
}