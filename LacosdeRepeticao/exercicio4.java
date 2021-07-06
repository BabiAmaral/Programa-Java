package LacosdeRepeticao;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		/* Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.
		 */
		int idade, genero, caract, x=1, calmas=0, mulheresN=0, homensA=0, outrosC=0, p=0, pcd=0;
		
		while(x<=150)
		{
			
			Scanner leia= new Scanner (System.in);
			System.out.println("Qual sua idade? ");
			idade= leia.nextInt();
			
			System.out.println("\nEscolha sua identidade de gênero: \nFeminino= digite 1 \nMasculino= digite 2 \nOutros= digite 3.");
			genero= leia.nextInt();
			
			System.out.println("nEscolha característica em que se indentifica: \nCalma= digite 1 \nNervosa= digite 2 \nAgressiva= digite 3.");
			caract= leia.nextInt();
			
			if(caract==1)// pessoas calmas
			{
				calmas++;
			}
			
			if (genero==1 && caract==2)//mulheres nervosas
			{
				mulheresN++;
			}
		    if (genero==2 && caract==3)//homens agressivos
			{
				homensA++;
			}
			if (genero==3 && caract==1)//outros calmos
			{
				outrosC++;
			}
			if (idade>40 && caract==2)//pessoas com mais de 40 anos nervosas
			{
				p++;
			}
			if (idade<18 && caract==1)//pessoas com menos de 18 calmas
			{
				pcd++; 
			}
			
			
			x++;// quantidade de pessoas
		}
		System.out.println("Entre os entrevistados, notamos: \nPessoas calmas: "+ calmas+ "\nMulheres nervosas: "+ mulheresN+ "\nOutros calmos: " +outrosC+"\nPessoas nervosas com mais de 40 anos: "+p+"\nPessoas calmas com menos de 18 anos: "+ pcd);
		
	}

	
}

