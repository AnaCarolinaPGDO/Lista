package com.poo.lista.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void resolucao2(){
      //Código de resolução: Exercicio3.resolucao2();
         Scanner sc = new Scanner(System.in);
         String condicao;
         int idade; 

         System.out.println("Digite seu seu nome: ");
         sc.nextLine();

         System.out.println("É deficiente ou gestante: ");
         condicao = sc.nextLine();

         System.out.println("Idade do cliente: ");
         idade = sc.nextInt();

         if(idade > 65 || condicao.equalsIgnoreCase("gestante")|| condicao.equalsIgnoreCase("deficiente")){
            System.out.println("Preferêncial");
         }
         else{
            System.out.println("Comum");}


         sc.close();
    }

}