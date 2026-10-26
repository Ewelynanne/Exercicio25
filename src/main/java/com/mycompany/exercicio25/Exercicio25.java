
package com.mycompany.exercicio25;

public class Exercicio25 {

    public static void main(String[] args) {
        
       int qtde = 4;
       double vetor[] = new double[qtde];
       Scanner leitor = new Scanner(System.in);
       
       for(int i = 0, i < qtde;i++){
           System.out.println("digite o valor ("+i+"):");
           vetor[i] = Double.parseDouble(leitor.nextline());
       }
       
       double soma = 0;
       for(int i = 0,i < qtde;i++){
           soma = soma + vetor[i];
       }
       double media = soma/qtde;
       
       System.out.println("A soma e:" + soma + "\nA media e :" + media);
       
       }
    
    }
        