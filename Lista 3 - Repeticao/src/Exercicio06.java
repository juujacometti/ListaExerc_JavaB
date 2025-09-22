import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Dado um número, mostre sua tabuada de 0 a 10, no seguinte formato, considerando como exemplo o número 2:
- 2 x 0 = 0
- 2 x 1 = 2
- 2 x 2 = 4
(e assim por diante)
*/

        int numero = 0;

        // Veriicação do número
        while (true) {
            try {
                System.out.print("Digite um número para ver sua tabuada: ");
                numero = leia.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números inteiros. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Exibe a tabuada de 0 a 10
        System.out.println("\n=== Tabuada do " + numero + " ===");

        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

