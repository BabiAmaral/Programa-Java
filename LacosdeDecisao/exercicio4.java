package LacosdeDecisao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � 
		 * par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o 
		 * n�mero elevado ao quadrado.
         */
         int num; //resr= raiz quadrada do num, resq= num elevado ao quadrado
		double resr,  resq;
         
         Scanner leia= new Scanner(System.in);
 		 System.out.println("Entre com um n�mero: ");
 		 num=leia.nextInt();
 		 
 		 if(num%2==0)
 		 {
 			
 			 System.out.println("Este n�mero � par e a raiz quadrada dele �: "+ Math.sqrt(num));
 			 
 		 }
 		 else
 		 {
 			 System.out.println("Este n�mero � �mpar e ele elevado ao quadrado � igual a: "+ Math.pow(num,2));
 			 
 		 }
         
	}

}
