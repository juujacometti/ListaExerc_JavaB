import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Pergunte ao usuário o valor unitário de um produto e a quantidade que ele quer comprar desse produto.
- Se a quantidade que ele deseja for até 12 unidades, o valor do produto é o valor unitário normal vezes a quantidade.
- Se ele deseja comprar mais do que 12 unidades, o valor unitário do produto terá o desconto de 10%, ou, o valor total da compra.
- Mostre na tela o valor total da compra, baseado nessas condições.
*/

        int quantProduto;
        double valorUnitProduto, valorProduto;

        System.out.println("=== CÁLCULO DE COMPRA ===");

        // Verificação do valor unitário do produto
        while (true) {
            try {
                System.out.print("  Informe o valor unitário do produto: ");
                valorUnitProduto = leia.nextDouble();
                if (valorUnitProduto < 0) {
                    System.out.println("Insira apenas valores positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação da quantidade do produto
        while (true) {
            try {
                System.out.print("  Informe a quantidade de produto desejada: ");
                quantProduto = leia.nextInt();
                if (quantProduto < 0) {
                    System.out.println("Insira apenas valores positivos (maior ou igual a zero). Tente novamente!\n");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInforme apenas números inteiros. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Cálculo do valor do produto
        if (quantProduto <= 12) {
            valorProduto = valorUnitProduto * quantProduto;
            System.out.printf("  TOTAL: %.2f", valorProduto);
        }
        else {
            valorProduto = valorUnitProduto * quantProduto;
            System.out.printf("  Desconto: %.2f\n", (valorProduto * 0.1));
            System.out.printf("  TOTAL: %.2f", (valorProduto - (valorProduto * 0.1)));
        }
    }
}
