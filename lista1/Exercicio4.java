package com.poo.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void resolucao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        System.out.println("O antecessor é "+(numero-1)+" e o seu sucessor é "+(numero+1));
        
        sc.close();
    }

}

