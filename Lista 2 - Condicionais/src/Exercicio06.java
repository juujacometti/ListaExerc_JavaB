import java.util.InputMismatchException;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Gere um número da sorte para uma pessoa.
- Esse número deve ser de 01 a 100, aleatório (pesquise como gerar números aleatórios no Java, em um intervalo específico).
- O programa deverá solicitar um número para a pessoa, com a finalidade dela acertar esse número.
- Caso acerte, mostrar uma mensagem na tela informando “Você acertou”, caso contrário, informar “Você errou”.
- Desafio: fazer o programa dar 3 chances para o usuário acertar o número aleatório.
*/

        int numero, minimo = 1, maximo = 100, numeroSorteado, tentativa = 3;

        numeroSorteado = ThreadLocalRandom.current().nextInt(minimo, maximo + 1);

        System.out.println("=== NÚMERO DA SORTE ===");

        // Verificação de número da sorte
        for (int i = 1; i < 4; i++) {
            while (true) {
                try {
                    System.out.printf("  Informe seu número da sorte (1 a 100): ");
                    numero = leia.nextInt();

                    if (numero < 1 || numero > 100) {
                        System.out.println("Insira apenas números positivos de 1 a 100. Tente novamente!\n");
                    }
                    else {
                        break;
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Informe apenas números no intervalo de 1 a 100. Tente novamente!\n");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }

            // Verificação de combinação de números
            if (numero == numeroSorteado) {
                System.out.printf("\n=== RESULTADO ===\n  Tentativa: %d\n  Número da sorte: %d\n  Número sorteado: %d\n-- Você venceu! --\n\n", i, numero, numeroSorteado);
                break;
            }
            else {
                System.out.printf("\n=== RESULTADO ===\n  Tentativa: %d\n  Número da sorte: %d\n  Número sorteado: (Não revelado)\n-- Tente novamente! --\n\n", i, numero);
            }
        }

        System.out.printf("\n=== REVELAÇÃO ===\n  Número sorteado: %d \n-- Você perdeu! --", numeroSorteado);
    }
}