package ArrayVetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que receba 6 números inteiros e mostre: 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.

		 */
		int [] num= new int[6];
		int x=0, somaPar=0, contImpar=0;
		
		Scanner leia= new Scanner(System.in);
		
		for(x=0; x<6; x++)
		{
			System.out.println("Digite um número inteiro: ");
			num[x]= leia.nextInt();
			
			if(num[x] % 2 == 0)
			{
			//System.out.println(num[x] + " é par.\n");
			somaPar= somaPar+num[x];
			
			}
			else
			{
			//System.out.println(num[x] + " é ímpar.\n");
			contImpar++;
			
			}
			
		}
		for(x=0; x<6; x++)
		{
			
			if(num[x] % 2 == 0)
			{
				System.out.println(num[x] + " é par.\n");
			}
			else
			{
				System.out.println(num[x] + " é ímpar.\n");	
			}
		}
		System.out.println("\nA soma dos números pares é: "+ somaPar);
		System.out.printf("\nForam digitados %d números ímpares.", contImpar);

	}

}
