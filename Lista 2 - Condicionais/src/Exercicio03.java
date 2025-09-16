import java.sql.Time;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça a quantidade de gols de um timeA e de um timeB em um jogo qualquer.
Ao final, mostre quem venceu ou se houve empate baseado na quantidade de gols de cada time.
*/

        int timeA, timeB;

        System.out.println("=== VERIFICAÇÃO DO PLACAR ===");

        // Verificação gols time A
        while (true) {
            try {
                System.out.print("Gols do time A: ");
                timeA = leia.nextInt();
                if (timeA < 0) {
                    System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Insira apenas números inteiros. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação de gols time B
        while (true) {
            try {
                System.out.print("Gols do time B: ");
                timeB = leia.nextInt();
                if (timeB < 0) {
                    System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("Insira apenas números inteiros. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Cálculo do ganhador
        if (timeA > timeB) {
            System.out.printf("\n=== PLACAR FINAL ===\n  Gols time A: %d\n  Gols time B: %d\n  * VENCEDOR: Time A *", timeA, timeB);
        }
        else if (timeA == timeB) {
            System.out.printf("\n=== PLACAR FINAL ===\n  Gols time A: %d\n  Gols time B: %d\n  * EMPATE! - Não hove vencedor *", timeA, timeB);
        }
        else {
            System.out.printf("\n=== PLACAR FINAL ===\n  Gols time A: %d\n  Gols time B: %d\n  * VENCEDOR: Time B *", timeA, timeB);
        }
    }
}