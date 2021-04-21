import java.util.Scanner;

public class EhPrimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número:");
        int num = scan.nextInt();
        int cont = 1;
        int qtdDivisores = 0;

        if (num == 0) {
            System.out.println("O número 0 é primo");
        } else {
            for (cont = 1; cont<=num; cont++) {
                if ((num % cont) == 0) {
                    qtdDivisores++;
                }
            }
            System.out.println(qtdDivisores);
            if (qtdDivisores == 2) {
                System.out.println("O número " + num + " é primo");
            } else {
                System.out.println("O número " + num + " não é primo");
            }

        }
    }
}