package com.poo.lista.lista2;

import java.util.Scanner;

public class Exercicio6 {
    public static void resolucao2(){
        //Código de resolução: Exercicio6.resolucao2();
         Scanner sc = new Scanner(System.in);

         System.out.println("Nome do aluno:");
         sc.nextLine();

         System.out.println("Nota 1: ");
         double nota1 = sc.nextDouble();

         System.out.println("Nota 2: ");
         double nota2 = sc.nextDouble();

         double media = (nota1+nota2)/2;
         if(media >= 6){
            System.out.println("Aprovado!!!");
         }
         else{
            System.out.println("Recuperação.");
            System.out.println("Insira a nota da recuperação: ");
            double recuperacao = sc.nextDouble();
            double mediaRecuperacao = (recuperacao + Math.max(nota1,nota2)/2);
            if(mediaRecuperacao>=6){
                System.out.println("Aprovado!");
            }
            else{
                System.out.println("Reprovado.");
            }
         }

    sc.close();
    }     

}