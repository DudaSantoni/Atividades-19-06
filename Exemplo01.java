package matriz;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int m[][] =new int [3][3];

		//Entrada de Dados
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				m[i][j] = (int)Math.round(Math.random()*100);
			}
		}

		//Saída de Dados
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(" Os valores são " + m[i][j]);

			}
		}
		ler.close();
	}
}
