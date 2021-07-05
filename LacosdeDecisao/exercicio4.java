package LacosdeDecisao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é 
		 * par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o 
		 * número elevado ao quadrado.
         */
         int num; //resr= raiz quadrada do num, resq= num elevado ao quadrado
		double resr,  resq;
         
         Scanner leia= new Scanner(System.in);
 		 System.out.println("Entre com um número: ");
 		 num=leia.nextInt();
 		 
 		 if(num%2==0)
 		 {
 			
 			 System.out.println("Este número é par e a raiz quadrada dele é: "+ Math.sqrt(num));
 			 
 		 }
 		 else
 		 {
 			 System.out.println("Este número é ímpar e ele elevado ao quadrado é igual a: "+ Math.pow(num,2));
 			 
 		 }
         
	}

}
