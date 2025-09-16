import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça ao usuário uma idade e mostre na tela em qual categoria a pessoa se encaixa, de acordo com a tabela abaixo:
- 0 a 14 -> Criança / 15 a 17 -> Adolescente / 18 a 30 -> Adulto jovem / 30 ou mais -> Adulto
*/

        int idade;

        System.out.println("=== CLASSIFICAÇÃO DE IDADE ===");

        // Verificação de idade
        while (true) {
            try {
                System.out.print("  Informe a idade: ");
                idade = leia.nextInt();
                if (idade < 0) {
                    System.out.println("Informe apenas números positivos (maior ou igual a zero). Tente novamente!");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Classificação da idade
        if (idade <= 14) {
            System.out.println("  Classificação: Criança");
        }
        else if (idade <= 17) {
            System.out.println("  Classificação: Adolescente");
        }
        else if (idade <= 30) {
            System.out.println("  Classificação: Adulto jovem");
        }
        else {
            System.out.println("  Classificação: Adulto");
        }
    }
}