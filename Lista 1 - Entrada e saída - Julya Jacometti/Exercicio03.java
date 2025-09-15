import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Calcule o valor de venda de uma mercadoria, considerando que o usuário irá informar seu valor de compra.
- O valor de venda é: o valor de compra + 20% do representante + 30% de impostos.
- Mostre o valor de venda dessa mercadoria e separadamente, os valores do representante e dos impostos.
- Os valores de 20% e 30% são calculados com base no valor de compra.
*/

        double valorCompra, valorVenda, representante, imposto;

        while (true) {
            try {
                System.out.print("Olá! Para saber o valor da mercadoria, informe o valor da compra: ");
                valorCompra = leia.nextDouble();
                break;
            } catch (InputMismatchException e ) {
                System.out.println("Informe um valor de compra válido!");
                leia.nextLine();    // Limpando valor inválido
            }
        }


        // Cálculos (valor da venda, representante e imposto)
        representante = 0.2 * valorCompra;
        imposto = 0.3 * valorCompra;
        valorVenda = valorCompra + representante + imposto;

        System.out.printf("==== VALORES ====\n  Valor da venda: %.2f\n  20%% do representante: %.2f\n  30%% de impostos: %.2f", valorVenda, representante, imposto);

    }
}
