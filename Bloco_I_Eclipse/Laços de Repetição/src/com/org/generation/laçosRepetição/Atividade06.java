package com.org.generation.la�osRepeti��o;

import java.util.Scanner;

public class Atividade06 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
			
		int num,contador=0,soma=0;
		double media;
			
			do 
			{
				
				System.out.println("Digite um n�mero inteiro, e finalize digitando 0: ");
				num = leia.nextInt();
				
				if(num%3 == 0 && num!=0) 
				{	
				soma += num;
				contador++;
				}
			}
			
			while(num !=0);
			media = soma/contador;
			
			System.out.print("A m�dia dos m�ltiplos de 3 �: " + media);
			
			leia.close();
		}
	}