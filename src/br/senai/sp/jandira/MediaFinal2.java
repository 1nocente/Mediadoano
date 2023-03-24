package br.senai.sp.jandira;

import java.util.Scanner;

public class MediaFinal2 {

	public static void main(String[] args) {
	    
		Scanner input = new Scanner(System.in);
		

	      System.out.println("*************************************");
	      System.out.println("             MÉDIA FINAL             ");
	      System.out.println("*************************************");
	      
	      System.out.println("Nome do estudante: ");
	     String nomeAluno = input.nextLine();
	     
	     System.out.println("Nota do 1° bimestre: ");
	     double nota1 = input.nextDouble();
	     
	     System.out.println("Nota do 2° bimestre: ");
	     double nota2 = input.nextDouble();
	     
	     System.out.println("Nota do 3° bimestre: ");
	     double nota3 = input.nextDouble();
	     
	     System.out.println("nota do 4° bimestre: ");
	     double nota4 = input.nextDouble();
	     
	     double finalMedia = (nota1 + nota2 + nota3 + nota4) / 4;
	     
	     System.out.println("------------------------------------");
	     
	      System.out.println(nomeAluno + ", a sua nota final é " + finalMedia);

	      if (finalMedia >= 6.0) {
	         System.out.println("PARABÉNS!! VOCÊ FOI APROVADO!!");
	      } else {
	         System.out.println("QUE PENA!! VOCÊ FOI REPROVADO!!");
	      }
	      System.out.println("------------------------------------");

	     
	     
	     
	     
	     
	     
	   


	}

}
