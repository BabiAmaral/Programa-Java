package ArrayVetoresMatrizes;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		 //Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.

		float [][] valor= new float [3][3];
		int x=0, l, c;
		
		Scanner leia= new Scanner(System.in);
		for(l=0; l<3; l++)
		{
			for(c=0; c<3; c++)
			{
				System.out.println("\nEntre com um valor:");
				valor[l][c]= leia.nextFloat();
				
				if(valor[l][c]>10)
				{
					x++;
				}
			}
		}
		System.out.printf("Há %d valores maiores que 10.", x);

	}

}
