package LacosdeDecisao;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que entre com três números e coloque em ordem crescente.
		float num1, num2, num3;
		/* Possibilidades
		Num1  Num2  Num3 ok
		Num1  Num3  Num2 ok 
		Num2  Num1  Num3 ok
		Num2  Num3  Num1 ok
		Num3  Num2  Num1 ok
		Num3  Num1  Num2 ok
		*/
		Scanner leia= new Scanner(System.in);
		System.out.println("Entre com o primeiro número: ");
		num1=leia.nextFloat();
		System.out.println("Entre com o segundo número: ");
		num2=leia.nextFloat();
		System.out.println("Entre com o terceiro número: ");
		num3=leia.nextFloat();
		
		if(num1>=num2 && num2>=num3)
		{ 
			System.out.println(num3+", "+num2+", "+ num1); 
		}
		else if(num2>=num1 && num1>=num3)
		{ 
			System.out.println(num3+", "+num1+", "+ num2); 
		}
		else if(num3>=num2 && num2>=num1)
		{ 
			System.out.println(num1+", "+num2+", "+ num3); 
		}
		else if(num3>=num1 && num1>=num2)
		{ 
			System.out.println( num2+", "+num1+", "+ num3); 
		}
		else if(num2>=num3 && num3>=num1)
		{ 
			System.out.println(num1+", "+num3+", "+ num2);
		}
		else
		{ 
			System.out.println(num2+", "+num3+", "+ num1);
		}
	}

}
