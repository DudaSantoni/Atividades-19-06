package matriz;

import java.util.Scanner;

public class MultiplicacaoMatrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int m1[][] =new int [3][3];
		int m2[][] =new int [3][3];
		int m3[][] =new int [3][3];

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				m1[i][j] = (int)Math.round(Math.random()*5);
				m2[i][j] = (int)Math.round(Math.random()*5);
				m3[i][j] = m1[i][j] * m2[i][j];

			}

		}

		System.out.println("Matriz 1");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				System.out.print("[" + m1[i][j] + "]");
			}
			System.out.println("\n");
		}

		System.out.println("Matriz 2");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				System.out.print("[" + m2[i][j] + "]");
			}
			System.out.println("\n");
		}

		System.out.println("Matriz 3");
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++){
				System.out.print("[" + m3[i][j] + "]");
			}
			System.out.println("\n");
		}
		ler.close();
	}
}

