package com.org.generation.la�osDecisao;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) 
	{
		//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int [] numero;
		numero = new int[3];
		
		
		for(int i = 0; i <3; i++) 
		{
			 
			System.out.print("Digite o "+ (i +1) +"� n�mero inteiro: ");
			numero[i] = leia.nextInt();
		}
		
		if (numero[0] > numero [1] && numero[0] > numero [2]) 
		{
			System.out.print("O maior n�mero �: "+numero[0]);
		}
		
		
		else if(numero[0] < numero [1] && numero [1] > numero[2]) 
		{
			System.out.print("O maior n�mero �: " +numero[1]);
		}
		
		
		else if(numero[0] < numero[2] && numero[2] > numero [1])
		{
			System.out.print("O maior n�mero �: ");
		}
		leia.close();
		}
}
