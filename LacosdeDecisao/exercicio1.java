package LacosdeDecisao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		int num1, num2, num3;
		Scanner leia= new Scanner(System.in);
		System.out.println("Entre com o primeiro n�mero: ");
		num1=leia.nextInt();
		System.out.println("Entre com o segundo n�mero: ");
		num2=leia.nextInt();
		System.out.println("Entre com o terceiro n�mero: ");
		num3=leia.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("O maior n�mero �: "+num1);
		}	
		else if(num2>num1 && num2>num3)
		{
			System.out.println("O maior n�mero �: "+num2);
		}	
		else
		{
			System.out.println("O maior n�mero �: "+num3);
		}	
	}

}
