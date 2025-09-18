import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Faça um algoritmo para ler:
- Quantidade atual em estoque, quantidade máxima em estoque e quantidade mínima em estoque de um produto.
- Calcular e escrever a quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2).
- Se a quantidade em estoque for maior ou igual a quantidade média escrever a mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.
*/

        int estoqueAtual, estoqueMaximo, estoqueMinimo;
        double media;

        System.out.print("=== VERIFICAÇÃO DE ESTOQUE ===\n");

        // Verificação de quantidade atual mo estoque
        while (true) {
            try {
                System.out.print("  Informe a quantidade atual no estoque: ");
                estoqueAtual = leia.nextInt();

                if (estoqueAtual < 0) {
                    System.out.println("Informe apenas números positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação da quantidade máxima do estoque
        while (true) {
            try {
                System.out.print("  Informe a quantidade máxima do estoque: ");
                estoqueMaximo = leia.nextInt();

                if (estoqueMaximo < 0) {
                    System.out.println("Informe apenas números positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação de quantidade mínima do estoque
        while (true) {
            try {
                System.out.print("  Informe a quantidade mínima do estoque: ");
                estoqueMinimo = leia.nextInt();

                if (estoqueMinimo < 0) {
                    System.out.println("Informe apenas números positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números inteiros. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Cálculo da média do estoque
        media  = (double) (estoqueMaximo + estoqueMinimo) / 2;

        if (estoqueAtual >= media) {
            System.out.printf("\n=== RELATÓRIO ===\n  Quantidade máxima: %d\n  Quantidade atual: %d\n  Quantidade mínima: %d\n- Não efetuar compra.", estoqueMaximo, estoqueAtual, estoqueMinimo);
        }
        else {
            System.out.printf("\n=== RELATÓRIO ===\n  Quantidade máxima: %d\n  Quantidade atual: %d\n  Quantidade mínima: %d\n- Efetuar compra.", estoqueMaximo, estoqueAtual, estoqueMinimo);
        }
    }
}
