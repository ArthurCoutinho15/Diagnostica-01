package br.newtonpaiva.ui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[8];
        int maior = 0, soma = 0;
        for(int i = 0; i < 8; i++){
            System.out.println("Entre com um número: ");
            vet[i] = sc.nextInt();

            if(vet[i] > 30){
                maior++;
                soma+=vet[i];
            }
        }

        System.out.println("Quantidade de números maiores que 30: " + maior);
        System.out.println("Soma dos números maiores que 30: " + soma);




    }
}