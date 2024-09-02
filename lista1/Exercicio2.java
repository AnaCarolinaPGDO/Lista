package com.poo.lista1;

import java.util.Scanner;

public class Exercicio2 {
        public static void main(String[] args) {
            System.out.println("""
                    
                    Exercício 2
                    
                    2) Escreva um programa que pergunte o nome e o
                    sobrenome do usuário e escreva na tela: "Olá, -usuário-".
                    
                    """);
            String nome;
            try (Scanner SC = new Scanner(System.in)) {
                System.out.println("Digite o nome do aluno: ");
                nome = SC.nextLine();
            }
            System.out.println("Olá, " + nome +"!");
        }
    }
