package ArrayVetoresMatrizes;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros 
		 * inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es 
A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
         */
		int A[] = {1, 0, 5, -2, -5, 7};
		int soma=0, x;
		
		soma=A[0]+A[1]+A[5];
		A[4]=100;
		System.out.printf("A soma das posi��es 0, 1 e 3 � de %d.", soma);
		System.out.printf("\nTendo o vetor A os seguintes valores: \n%d \n%d \n%d \n%d \n%d \n%d", A[0], A[1], A[2], A[3], A[4],A[5]);
	    
	}

}
