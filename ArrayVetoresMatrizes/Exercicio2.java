package ArrayVetoresMatrizes;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
� Os n�meros pares digitados;  
� A soma dos n�meros pares digitados; 
� Os n�meros �mpares digitados; 
� A quantidade de n�meros �mpares digitados.

		 */
		int [] num= new int[6];
		int x=0, somaPar=0, contImpar=0;
		
		Scanner leia= new Scanner(System.in);
		
		for(x=0; x<6; x++)
		{
			System.out.println("Digite um n�mero inteiro: ");
			num[x]= leia.nextInt();
			
			if(num[x] % 2 == 0)
			{
			//System.out.println(num[x] + " � par.\n");
			somaPar= somaPar+num[x];
			
			}
			else
			{
			//System.out.println(num[x] + " � �mpar.\n");
			contImpar++;
			
			}
			
		}
		for(x=0; x<6; x++)
		{
			
			if(num[x] % 2 == 0)
			{
				System.out.println(num[x] + " � par.\n");
			}
			else
			{
				System.out.println(num[x] + " � �mpar.\n");	
			}
		}
		System.out.println("\nA soma dos n�meros pares �: "+ somaPar);
		System.out.printf("\nForam digitados %d n�meros �mpares.", contImpar);

	}

}
