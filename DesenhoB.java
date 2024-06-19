package matriz;

public class DesenhoB {

	public static void main(String[] args) {
		// Tamanho da figura

		// Criando e preenchendo a matriz para figura B
		char[][] matriz = new char [4][4];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j == 4 - 1 - i || j == 4 - 1 + i) {
					matriz[i][j] = '*';
				} else {
					matriz[i][j] = ' ';
				}
			}
		}
		// Exibindo a figura B
		System.out.println("Figura B:");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
