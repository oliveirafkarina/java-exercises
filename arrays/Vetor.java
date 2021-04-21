package arrays;

import java.util.Random;

public class Vetor {
    public static void main(String[] args) {
        int cont, maior, menor;
        Integer[] vetorA = new Integer[15];
        Integer[] vetorB = new Integer[15];
        Random random= new Random();

        System.out.println("Vetor A:");
        for(cont=0; cont<15; cont++){
            vetorA[cont] = random.nextInt(100);
            System.out.println(vetorA[cont]);
        }

        System.out.println("Vetor B:");
        for(cont=0; cont<15; cont++){
            vetorB[cont] = vetorA[cont]*vetorA[cont];
            System.out.println(vetorB[cont]);
        }

        //maior número de A
        maior = vetorA[0];
        for(cont=0; cont<15; cont++){
            if(vetorA[cont] > maior){
                maior = vetorA[cont];
            }
        }

        System.out.println("O maior valor do vetor A: " + maior);

        //menor valor de B
        menor = vetorB[0];
        for(cont=0; cont<15; cont ++){
            if(vetorB[cont] < menor){
                menor = vetorB[cont];
            }
        }

        System.out.println("O menor valor do vetor B: " + menor);
    }
}
