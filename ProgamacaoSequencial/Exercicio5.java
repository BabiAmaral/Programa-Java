package ProgamacaoSequencial;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {		
		/* Fa�a um sistema que leia as 3 notas de um aluno e calcule a m�dia final deste
aluno. Considerar que a m�dia � ponderada e que o peso das notas �: 2,3 e 5,
respectivamente.
		 */
		float nota1, nota2, nota3, mediaf;
		Scanner leia = new Scanner(System.in);
		System.out.println("Entre com a primeira nota do aluno: ");
		nota1=leia.nextFloat();
		System.out.println("Entre com a segunda nota do aluno: ");
		nota2=leia.nextFloat();
		System.out.println("Entre com a terceira nota do aluno: ");
		nota3=leia.nextFloat();
		
		mediaf= (nota1*2 + nota2*3 + nota3*5)/10;
		System.out.println("A m�dia do aluno � de: "+mediaf);
		
	}

}
