package LacosdeRepeticao;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		/*Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados.(DO...WHILE)
		 */
		int num, soma=0;
		do
		{
			Scanner leia= new Scanner(System.in);
			System.out.println("Digite um n�mero do teclado: ");
			num= leia.nextInt();
		
			soma= soma+num;
		} while(num!=0);
		
		System.out.println("A soma dos n�meros digitados � de: "+soma);
	}

}
