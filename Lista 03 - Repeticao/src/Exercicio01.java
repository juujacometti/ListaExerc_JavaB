import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça 10 números ao usuário. Em seguida, pergunte a ele o que ele deseja saber (utilizando a estrutura switch):
- a. Quantos números pares?
- b. Quantos números ímpares?
- c. Quantos negativos?
- d. Quantos positivos?
- e. Sair do programa – utilize System.exit(0)
*/

        String escolha;
        int i = 0, pares, impares, negativos, positivos;

        int[] numeros = new int[10];    // Array com 10 posições para armazenar os 10 números

        System.out.println("Digte 10 números inteiros:");

        // Looping para solicitar os 10 números
        while (i < 10) {
            try {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = leia.nextInt();
                i++;
            }
            catch (InputMismatchException e) {
                System.out.println("Digite apenas números inteiros. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        System.out.println("\nO que você deseja saber?\n  a. Quantos números pares?\n  b. Quantos números ímpares?\n  c. Quantos negativos?\n  d. Quantos positivos?\n  e. Sair do programa");

        // Verificação da escolha do usuário
        while (true) {
            System.out.print("\nEscolha: ");
            escolha = leia.next().trim().toLowerCase();

            if (escolha.isEmpty()) {
                System.out.println("O campo está vazio. Digite uma letra válida (a, b, c, d ou e). Tente novamente!\n");
            }
            else if (!escolha.matches("[abcde]")) {    // Expressão para aceitar apenas uma das 5 opções disponíveis
                System.out.println("Opção inválida! Digite apenas a, b, c, d ou e. Tente novamente}!");
            }
            else {
                break;
            }
        }

        // Realização da escolha do usuário
        switch (escolha) {
            // Verificação de números pares
            case "a":
                pares = 0;
                for (int num : numeros) {    // : -> Percorre todos os elementos de um array
                    if (num % 2 == 0) pares++;
                }
                System.out.println("\nQuantidade de números pares: " + pares);
                break;

            // Verificação de ímpares
            case "b":
                impares = 0;
                for (int num : numeros) {
                    if (num % 2 != 0) impares++;
                }
                System.out.println("\nQuantidade de números ímpares: " + impares);
                break;

            // Verificação de negativos
            case "c":
                negativos = 0;
                for (int num : numeros) {
                    if (num < 0) negativos++;
                }
                System.out.println("\nQuantidade de números negativos: " + negativos);
                break;

            // Verificação de positivos
            case "d":
                positivos = 0;
                for (int num : numeros) {
                    if (num > 0) positivos++;
                }
                System.out.println("\nQuantidade de números positivos: " + positivos);
                break;

            // Saindo do programa
            case "e":
                System.out.println("\nEncerrando o programa...");
                System.exit(0);    // Comando que encerra a máquina virtual java
                break;

            default:
                System.out.println("\nOpção inválida. Tente novamente!");
        }
    }
}
