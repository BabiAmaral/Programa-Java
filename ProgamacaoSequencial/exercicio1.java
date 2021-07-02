package ProgamacaoSequencial;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		/* Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.
		 */
		int anos, meses, dias, diastotais;
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite sua idade em anos:");
		anos=leia.nextInt();
		System.out.println("Digite os meses de sua idade:");
		meses=leia.nextInt();
		System.out.println("Digite os dias de sua idade:");
		dias=leia.nextInt();
		
		diastotais= anos*365 + meses*30 + dias;
		System.out.println("A sua idade em dias é: "+ diastotais);
		
	}

}
