package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade01 {
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int diaNiver, mesNiver, anoNascimento, diaAtual, mesAtual, anoAtual, total;
		
		System.out.print("Informe o dia do seu anivers�rio: ");
		diaNiver = leia.nextInt();
		
		System.out.print("Informe o m�s do seu anivers�rio: ");
		mesNiver = leia.nextInt();
		
		System.out.print("Informe o ano do seu nascimento: ");
		anoNascimento = leia.nextInt();
		
		System.out.print("Informe o dia atual: ");
		diaAtual = leia.nextInt();
		
		System.out.print("Informe o mes atual: ");
		mesAtual = leia.nextInt();
		
		System.out.print("Informe o ano atual: ");
		anoAtual = leia.nextInt();
		
		total = ((anoAtual - anoNascimento)*365) + ((mesAtual*30) + diaAtual) - ((mesNiver*30) + diaNiver);
		
		System.out.print("A sua idade em dias �: " +total+ "dias.");
		leia.close();
	}
}
