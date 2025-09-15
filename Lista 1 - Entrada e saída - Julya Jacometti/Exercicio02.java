import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Receba dois números inteiros e mostre na tela:
- Soma dos dois números, Subtração do primeiro pelo segundo, Multiplicação dos dois números, Divisão do primeiro número pelo segundo,
  O primeiro número elevado ao segundo número, O resto da divisão do primeiro número pelo segundo.
- Desafio 1: Mostre a divisão dos números somente se o segundo número não for 0. Caso o segundo número seja 0, mostrar uma mensagem:
  A divisão não poderá ser realizada.
- Desafio 2: Pesquise potenciação em Java para realizar a letra e.
*/

        int numero1, numero2;

        while (true) {
            try {
                System.out.print("Insira o primeiro número: ");
                numero1 = leia.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido.");
                leia.nextLine();    // Limpeza da informação inválida
            }
        }

        while (true) {
            try {
                System.out.print("Insira o primeiro número: ");
                numero2 = leia.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Insira um número válido.");
                leia.nextLine();    // Limpeza da informação inválida
            }
        }

        System.out.print("====== OPERAÇÕES ======\n");
        System.out.printf("* Soma dos números:\n  %d + %d = " + (numero1 + numero2),  numero1, numero2);
        System.out.printf("\n* Subtração do primeiro número pelo segundo:\n  %d - %d = " + (numero1 - numero2),  numero1, numero2);
        System.out.printf("\n* Multiplicação dos números:\n  %d * %d = " + (numero1 * numero2),  numero1, numero2);

        // Verificação de possibilidade de divisão
        System.out.print("\n* Divisão do primeiro número pelo segundo:\n");
        if (numero2 == 0) {
            System.out.println("  Não é possível realizar a divisão, pois o segundo número informado é zero.");
        }
        else {
            System.out.printf("  %d / %d = " + (numero1 / numero2) + "\n",  numero1, numero2);
        }

        System.out.printf("* Primeiro número elevado ao segundo:\n  %d ^ %d = " + Math.pow(numero1, numero2),  numero1, numero2);

        // Verificação de possibilidade de divisão
        System.out.print("\n* Resto da divisão do primeiro número pelo segundo:\n");
        if (numero2 == 0) {
            System.out.println("  Não é possível realizar a divisão, pois o segundo número informado é zero.");
        }
        else {
            System.out.printf("  %d / %d = resto " + (numero1 % numero2) + "\n",  numero1, numero2);
        }
    }
}
