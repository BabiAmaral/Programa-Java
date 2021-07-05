package LacosdeDecisao;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		//Faça um programa que receba três inteiros e diga qual deles é o maior.
		int num1, num2, num3;
		Scanner leia= new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		num1=leia.nextInt();
		System.out.println("Entre com o segundo número: ");
		num2=leia.nextInt();
		System.out.println("Entre com o terceiro número: ");
		num3=leia.nextInt();
		
		if(num1>num2 && num1>num3)
		{
			System.out.println("O maior número é: "+num1);
		}	
		else if(num2>num1 && num2>num3)
		{
			System.out.println("O maior número é: "+num2);
		}	
		else
		{
			System.out.println("O maior número é: "+num3);
		}	
	}

}
