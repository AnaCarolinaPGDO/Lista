package com.poo.lista1;

import java.util.Scanner;

public class Exercicio7 {
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        double n1, n2, n3, n4, media;
        String nome;

        System.out.println("Escreva o nome do aluno: ");
        nome = sc.nextLine();
        

        System.out.println("Escreva a primeira nota: ");
        n1 = sc.nextDouble();
        System.out.println("Escreva a segunda nota:");
        n2 = sc.nextDouble();
        System.out.println("Escreva a terceira nota: ");
        n3 = sc.nextDouble();
        System.out.println("Escreva a quarta nota: ");
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4)/4;

        System.out.println("A média do aluno "+nome+" é: "+ media);

        sc.close();
        


    }

}
