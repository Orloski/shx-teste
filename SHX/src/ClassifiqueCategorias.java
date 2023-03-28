import java.util.Scanner;

public class ClassifiqueCategorias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = teclado.nextInt();
		
		if(idade >= 5 && idade <= 7 ) {
			System.out.println("Categoria Infantil A: 5 a 7 anos");
		}else if(idade >= 8 && idade <= 11) {
			System.out.println("Categoria Infantil B: 8 a 11 anos");
		}else if(idade >= 12 && idade <= 13) {
			System.out.println("Categoria Juvenil A: 12 a 13 anos");
		}else if(idade >= 14 && idade <= 17) {
			System.out.println("Categoria Juvenil B: 14 a 17 anos");
		}else if (idade >= 18){
			System.out.println("Categoria Adulto: Maiores de 18 anos");
		}
	}

}
