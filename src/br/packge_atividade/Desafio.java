package br.packge_atividade;

public class Desafio{

    public static void main(String [] args){

        //1  Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double nota1 = 4.5;
        double nota2 = 5.6;

        double media = (nota1 + nota2) / 2;
        System.out.println("Essa é a média das notas: " + media );
        //02 .Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        int resultado = (int) media;

        System.out.println("Essa é a média com casting: " + media );



    }

}
