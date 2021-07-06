package LacosdeRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.(DO...WHILE)
		 */
		int num, soma=0;
		do
		{
			Scanner leia= new Scanner(System.in);
			System.out.println("Digite um número do teclado: ");
			num= leia.nextInt();
		
			soma= soma+num;
		} while(num!=0);
		
		System.out.println("A soma dos números digitados é de: "+soma);
	}

}
