package com.org.generation.la�osRepeti��o;

import java.util.Scanner;

public class Atividade05 {
public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
		
		int num = 0, soma = 0;
		
		do 
		{
			
			System.out.println("Digite o n�mero que deseja somar, e finalize digitando 0: ");
			num = leia.nextInt();
			
			soma += num;
		}
		
		while(num !=0);
		
		System.out.print("A soma de todos os n�meros �: " + soma);
		
		leia.close();
	}
}
