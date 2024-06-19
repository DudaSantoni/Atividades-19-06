package matriz;

import java.util.Scanner;

public class DiferentesMatrizes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		//A

		char letras[][] = {
				{'a', 'b', 'c', 'd', 'e'}, 
				{'f', 'g', 'h', 'i', 'j'}, 
				{'k', 'l', 'm', 'n', 'o'}, 
				{'p', 'q', 'r', 's', 't'}
		};

		for (char[] letra:letras) {
			for (char coluna:letra) {
				System.out.print( coluna + "\t");
			}
			System.out.println();
		}
		ler.close();
	}
}
