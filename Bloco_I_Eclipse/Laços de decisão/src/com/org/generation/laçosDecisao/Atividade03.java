package com.org.generation.la�osDecisao;

import java.util.Scanner;

public class Atividade03 {
	public static void main(String[] args) 
	{
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.print("Informe sua idade: ");
		idade= leia.nextInt();
		
		if (idade >=10 && idade <=14) 
		{
			System.out.println("A sua categoria � Infantil!");		
		}
		
		
		else if(idade >=15 && idade <=17)
		{
			System.out.println("A sua categoria � Juvenil!");
		}
		
		else if(idade >=18 && idade <=25)
		{
			System.out.println("A sua categoria � Adulto!");
		}
		
		else
		{
			System.out.println("Voc� n�o se encaixa em nenhuma categoria!");
		}
		leia.close();
		}
}
