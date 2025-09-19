import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça a idade, a altura e o peso de 10 pessoas e mostre na tela:
- a. Quantas tem idade acima de 50 anos
- b. Quantas tem altura acima de 1.60m
- c. Quantas tem peso abaixo de 80kg
*/

        int idade;
        double altura, peso;

        // Contadores
        int acima50 = 0, alturaMaior160 = 0, pesoMenor80 = 0;

        // Loopíng para a solicitação de informações
        for (int i = 1; i <= 10; i++) {
            System.out.println("\nPessoa " + i + ":");

            // Verificação da idade
            while (true) {
                try {
                    System.out.print("Idade: ");
                    idade = leia.nextInt();

                    if (idade < 0) {
                        System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!");
                    }
                    else {
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Insira apenas números. Tente novamente!");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }

            // Verificação da altura
            while (true) {
                try {
                    System.out.print("Altura (em metros): ");
                    altura = leia.nextDouble();

                    if (altura < 0) {
                        System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!");
                    }
                    else {
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Insira apenas números. Tente novamente!");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }

            // Verificação do peso
            while (true) {
                try {
                    System.out.print("Peso (em kg): ");
                    peso = leia.nextDouble();

                    if (peso < 0) {
                        System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!");
                    }
                    else {
                        break;
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Insira apenas números. Tente novamente!");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }

            // Verificações gerais
            if (idade > 50) {
                acima50++;
            }

            if (altura > 1.60) {
                alturaMaior160++;
            }

            if (peso < 80) {
                pesoMenor80++;
            }
        }

        // Exibição dos resultados
        System.out.printf("\n=== RESULTADOS ===\n  Pessoas com idade acima de 50 anos: %d\n  Pessoas com altura acima de 1.60m: %d\n Pessoas com peso abaixo de 80kg: %d", acima50, alturaMaior160, pesoMenor80);
    }
}
