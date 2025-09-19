import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça o saldo de várias pessoas.
- Ao final, mostre quantas delas apresentam saldo negativo e quantas delas positivos.
- Porém, deve ser classificado da seguinte forma:
    - Se 50% ou mais do total de pessoas apresentaram saldo positivo, deve ser mostrado “Nenhum risco!”, caso contrário deve ser mostrado “Risco ao banco!”.
- Após informar o saldo da primeira pessoa, o programa deverá perguntar se o usuário deseja continuar informando saldos ou encerrar, mostrando a mensagem.
*/

        int positivos = 0, negativos = 0, total = 0;
        double porcentagemPositivos;
        String continuar;

        System.out.println("=== SALDOS BANCÁRIOS ===");

        do {
            double saldo = 0;

            // Verificação do saldo
            while (true) {
                try {
                    System.out.print("\nInforme o saldo da pessoa: R$ ");
                    saldo = leia.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Insira apenas números. Tente novamente!\n");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }

            // Classificação do saldo
            if (saldo >= 0) {
                positivos++;
            }
            else {
                negativos++;
            }

            total++;


            leia.nextLine();

            // Verificação se o usuário quer continuar
            while (true) {
                System.out.print("Deseja continuar informando saldos? (S/N): ");
                continuar = leia.nextLine().trim().toUpperCase();

                if (continuar.equals("S") || continuar.equals("N")) {
                    break;
                } else {
                    System.out.println("Digite apenas S para 'sim' ou N para 'não'. Tente novamente!\n");
                }
            }

        } while (continuar.equals("S"));

        // Exibição dos resultados
        System.out.printf("\n=== RESULTADOS FINAIS ===\n  Total de pessoas: %d\n  Com saldo positivo: %d\n  Com saldo negativo: %d\n", total, positivos, negativos);

        // Classificação de risco
        porcentagemPositivos = (positivos * 100.0) / total;

        if (porcentagemPositivos >= 50.0) {
            System.out.println("Classificação: Nenhum risco!");
        }
        else {
            System.out.println("Classificação: Risco ao banco!");
        }
    }
}