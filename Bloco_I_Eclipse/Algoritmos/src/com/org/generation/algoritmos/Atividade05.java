package com.org.generation.algoritmos;

import java.util.Scanner;

public class Atividade05 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double N1, N2, N3, media;
		
		System.out.println("Insira a 1� nota:");
		N1 = ler.nextDouble();
		
		System.out.println("Insira a 2� nota:");
		N2 = ler.nextDouble();
		
		System.out.println("Insira a 3� nota:");
		N3 = ler.nextDouble();
		
		media = ((N1*2)+(N2*3)+(N3*5))/10;
		
		System.out.println("A m�dia �:" + media);
		ler.close();
				
	}
}
