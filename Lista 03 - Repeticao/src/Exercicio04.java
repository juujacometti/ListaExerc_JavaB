import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça ao usuário um número e um incremento.
- Após, mostre na tela do 0 até este número, respeitando o incremento informado.
  Ex.: Número = 20 / ncremento = 5
  Saída do programa = 0, 5 ,10, 15 ,20
*/

        int numeroFinal = 0, incremento = 0;

        // Verificação número final
        while (true) {
            try {
                System.out.print("Digite um número: ");
                numeroFinal = leia.nextInt();

                if (numeroFinal < 0) {
                    System.out.println("Digite um número positivo. Tente novamente!\n");
                }
                else {
                    break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Solicita o incremento
        while (true) {
            try {
                System.out.print("Digite o incremento: ");
                incremento = leia.nextInt();

                if (incremento <= 0) {
                    System.out.println("O incremento deve ser maior que zero. Tente novamente!\n");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Exibe os números de 0 até o número final, respeitando o incremento
        System.out.print("\nSequência: ");
        for (int i = 0; i <= numeroFinal; i += incremento) {
            System.out.print(i + " ");
        }

    }
}