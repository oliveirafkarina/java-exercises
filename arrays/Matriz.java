package arrays;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int linha, coluna, maior, menor, contDivisores, cont, contPrimos;
        Integer[][] numeros = new Integer[10][10];
        Random random = new Random();

        for(linha = 0; linha < 10; linha++){
            for(coluna = 0; coluna < 10; coluna ++){
                numeros[linha][coluna] = random.nextInt(100);
                System.out.println(numeros[linha][coluna]);
            }
        }

        //retornar maior valor da linha 5 e menor valor da linha 7
        maior = numeros[5][0];
        for(coluna = 0; coluna < 10; coluna ++){
            if(numeros[5][coluna] > maior){
                maior = numeros[5][coluna];
            }
        }

        menor = numeros[7][0];
        for(coluna = 0; coluna < 10; coluna ++){
            if(numeros[7][coluna] < menor){
               menor = numeros[7][coluna] ;
            }
        }

        System.out.println("O maior número da linha 5 é " + maior + "\n" +  "O menor número da linha 7 é " + menor);

        //Qtd de números primos na matriz
        contPrimos = 0;
        for(linha = 0; linha < 10; linha++){
            for(coluna = 0; coluna < 10; coluna ++){
                contDivisores = 0;
                for(cont=1; cont <= numeros[linha][coluna]; cont++){
                    if(numeros[linha][coluna]%cont == 0){
                        contDivisores ++;
                    }
                }
                if(contDivisores == 2){
                    contPrimos ++;
                }
            }
        }
        System.out.println("O número de números primos na matriz é: " + contPrimos);
    }
}
