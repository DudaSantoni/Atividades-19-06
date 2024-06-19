package matriz;

public class DesenhoA {

	public static void main(String[] args) {

		char matriz[][] =new char [4][4];

		for(int i=0; i<=3; i++) {
			for(int j=3; j>=0; j--) {
				if(i+j<=3) {
					matriz[i][j] = '*';
				}
				else {
					matriz[i][j]=' ';
				}
			}
		}
		for (char[] linha:matriz) {
			for (char letra:linha) {
				System.out.print( letra + " ");
			}
			System.out.println();
		}
	}
}


