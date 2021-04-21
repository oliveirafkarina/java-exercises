import java.util.Scanner;

public class TipoTriangulo {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o ângulo A do triângulo:");
            double angA = scan.nextDouble();
            System.out.println("Digite o ângulo B do triângulo:");
            double angB = scan.nextDouble();
            System.out.println("Digite o ângulo C do triângulo:");
            double angC = scan.nextDouble();

            if (angA == 0 || angB == 0 || angC == 0){
                System.out.println("A figura não é um triângulo");
            }
            else if (angA + angB + angC > 180 || angA + angB + angC < 180) {
                System.out.println("A figura não é um triângulo");
            }
            else {
                if (angA == 90 || angB == 90 || angC == 90) {
                    System.out.println("O triângulo é retângulo");
                } else if (angA > 90 || angB > 90 || angC > 90) {
                    System.out.println("O triângulo é obtuso");
                } else {
                    System.out.println("O triângulo é isósceles");
                }
            }

        }
    }



