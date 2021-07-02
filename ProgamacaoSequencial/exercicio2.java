package ProgamacaoSequencial;

import java.util.Scanner;

public class exercicio2 {
		public static void main(String[] args) {
		 /* Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.
		  */
			int diastotais, anos, meses, dias;
			Scanner leia= new Scanner(System.in);
			
			System.out.println("Escreva sua idade em dias: ");
			diastotais=leia.nextInt();
			
			anos= diastotais/365;
		    meses= (diastotais%365)/30;
			dias= (diastotais%365)%30;
			
			System.out.println("A idade é de: "+ anos+" anos "+ meses +" meses e "+ dias + " dias.");
					
		}	
}
