package com.org.generation.la�osRepeti��o;

import java.util.Scanner;

public class Atividade04 {
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, genero, mAgress = 0, fNerv = 0, outcalm = 0,calma = 0, humor;
		int iddHum = 0, iddCalm = 0, c = 1, loop=150;
		
		while(c <=loop) {
			System.out.println("\n" +c+"� pessoa: Qual a sua idade?: ");
			idade = leia.nextInt();
			System.out.println(c+"� pessoa: Qual o seu genero \n[1] Feminino \n[2] Masculino \n[3] Outros: ");
			genero =leia.nextInt();
			System.out.println(c+"� pessoa: Voc� se identifica como uma pessoa: \n[1] Calma \n[2] Nervosa \n[3] Agressiva? ");
			
			humor =leia.nextInt();
			
			if(humor == 1) 
			{
				calma++;
			} 
			if (genero == 1 && humor == 2) 
			{
				fNerv++;
			} 
			if(genero == 2 && humor ==3) 
			{
				mAgress++;
			}
			if(genero == 3 && humor == 1) 
			{
				outcalm++;
			}
			if(idade > 40 && humor==2)
			{
				iddHum++;				
			}
			if(idade<18 && humor==1) {
				iddCalm++;
				
			}
			c++;
		} 
			leia.close();
				
				System.out.println("\n O n�mero de pessoas calmas: " +calma);
				System.out.println("O n�mero de mulheres nervosas: " +fNerv);
				System.out.println("O n�mero de homens agressivos: " +mAgress);
				System.out.println("O n�mero de outros calmos: " +outcalm);
				System.out.println("O n�mero de pessoas nervosas com mais de 40 anos: " +iddHum);
				System.out.println("O n�mero de pessoas calmas com menos de 18 anos: " +iddCalm);
		}	
}
