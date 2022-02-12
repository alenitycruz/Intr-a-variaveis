package br.com.exercicio;

public class teste {

    public static void main(String[] args) {


        //Definição das variáveis 1

        int i;
       // int i; // variáveis não pode repetir nome
        int I; // difere por ser maiúsculo - java é case sensitive
       // int 1a; // variavel não pode iniciar com numero
        int _1a; // não é uma boa pratica apesar de permitido
        int $aq; // mesmo do anterior


        // Atribuição de valor as variáveis

        i = 5;
        I = 10;
        _1a = 20;
        $aq = 7;

        // Definição das variáveis 2

        final int j = 10;
       // j = 15; // A variável j é uma constante não podendo assim atribuir outro valor
        int sarau; //
        //int asd asda; // errado
        int sdf$ad_mh;
        //int asd%kk; // caractere não permitido

        sarau = 100;
        sdf$ad_mh = 10;


        // Definição das variáveis 3
        int quantidadeProduto = 50; // Correto uso da notação camelo
        //int QuantidadedeProduto; Não começar com letra maiúscula
        final int NUMERO_TENTATIVAS = 5;
        // final int numero_Tentativas = 5; variavel constate deve ser escrita com letras maiúsculas e separada por underline
        //int QUANTIDADE_OPCOES = 25;  Não é uma constate
        //int qdtProd; // Não é um nome expressivo


        System.out.println(i);
        System.out.println(I);
        System.out.println(_1a);
        System.out.println($aq);
        System.out.println(j);
        System.out.println(sarau);
        System.out.println(sdf$ad_mh);
        System.out.println(quantidadeProduto);
        System.out.println(NUMERO_TENTATIVAS);
        System.out.println();



    }

    
}
