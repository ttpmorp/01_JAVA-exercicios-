/// 5. Faça um Programa que peça para o usuário digitar 4 notas de
/// avaliação bimestrais e mostre a soma total das notas e a sua
/// média.

package prog_exercicios;

import java.util.Scanner;


public class exercicio5 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Nota 1: ");
		float n1 = input.nextFloat();
		
		System.out.print("Nota 2: ");
		float n2 = input.nextFloat();
		
		System.out.print("Nota 3: ");
		float n3 = input.nextFloat();
		
		System.out.print("Nota 4: ");
		float n4 = input.nextFloat();
		
		
		float soma = n1 + n2 + n3 +n4;
		float media = soma / 4;
		
		
		System.out.printf("A soma das notas é igua a %.2f e a média é igual a %.2f", soma, media);
		
		
		

	}

}
