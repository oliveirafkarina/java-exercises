package condicionais;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, cont, fatorial = 1;
        do {
            System.out.println("Digite o número que deseja saber o fatorial");
            numero = scan.nextInt();
        }while (numero <0);

        if(numero==0){
            System.out.println("O fatorial é "+ 1);
        }
        else{
            for(cont=1; cont<=numero;cont++){
                fatorial = fatorial * cont;
            }
            System.out.println("O fatorial é "+ fatorial);
        }
    }
}
