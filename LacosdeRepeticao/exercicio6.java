package LacosdeRepeticao;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		
		/*Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros
		 * m�ltiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		 */
		int num, soma=0, x=0;
		double  media;
		do
		{
			Scanner leia= new Scanner(System.in);
			System.out.println("Digite um n�mero do teclado ou 0 para sair: ");
			num= leia.nextInt();
		    if(num % 3 == 0 && num!=0)//diferente de 0, para n�o o contabilizar como multiplo de 3.
		    {
		    	soma=soma+num;
		    	x++;
		    }
		    //media=soma/x;
		} while(num!=0);

		  media=soma/x;
		  System.out.println("\nA m�dia dos n�meros mult�plos de 3 �:"+  media);
	}

}
