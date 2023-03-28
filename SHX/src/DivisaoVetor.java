//Linguagem Java

import java.util.Scanner;

public class DivisaoVetor {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		double k [] = new double [15];
		int vetora[] = new int[15];
		int vetorb[] = new int [15];
		
		for (int i = 0; i < 15; i++) {
		System.out.println("Digite o Vetor A: ");
		vetora[i] = teclado.nextInt();
		System.out.println("Digite o Vetor B: ");
		vetorb[i] = teclado.nextInt();	
		}
		
		for (int i = 0; i < 15; i++){
			k[i] = vetora[i] / vetorb[i];
		}
		for (int i = 0; i < 15; i++){
			System.out.println("Vetor K: " + k[i]);
		}
	}
}
