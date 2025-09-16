import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


// A partir de 02 notas de um aluno, seja calculada e mostrada sua média ponderada, considerando os pesos: 40% para a primeira nota e 60% para a segunda nota.

        double nota1, nota2, mediaPonderada;

        System.out.print("=== MÉDIA PONDERADA ===\n");

        // Validação de nota 1
        while (true) {
            try {
                System.out.print("  Nota 1: ");
                nota1 = leia.nextInt();
                if (nota1 >= 0) {
                    break;
                }
                else {
                    System.out.println("Informe um valor de nota positivo (maior ou igual a zero).\n");
                }
            } catch (InputMismatchException e) {
                System.out.print("Insira uma nota válida. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Validação de nota 2
        while (true) {
            try {
                System.out.print("  Nota 2: ");
                nota2 = leia.nextInt();
                if (nota2 >= 0) {
                    break;
                }
                else {
                    System.out.println("Informe um valor de nota positivo (maior ou igual a zero).\n");
                }
            } catch (InputMismatchException e) {
                System.out.print("Insira uma nota válida. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Cálculo média ponderada
        mediaPonderada =  (nota1 * 0.4) + (nota2 * 0.6) / (0.4 + 0.6);

        System.out.print("  Média ponderada: " + mediaPonderada);
    }
}
