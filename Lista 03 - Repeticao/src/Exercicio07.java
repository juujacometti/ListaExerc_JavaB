import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

//Crie um algoritmo que peça o nome, a altura e o peso de 6 pessoas e apresente o nome e peso da mais pesada e o nome e altura da mais alta

        String nome, nomeMaisPesada = "", nomeMaisAlta = "";
        double altura, peso;
        double maiorPeso = Double.MIN_VALUE;
        double maiorAltura = Double.MIN_VALUE;

        // Looping para coletar dados
        for (int i = 1; i <= 6; i++) {
            System.out.println("\nPessoa " + i + ":");

            System.out.print("Nome: ");
            nome = leia.nextLine();

            // Verificação da altura
            while (true) {
                try {
                    System.out.print("Altura (em metros): ");
                    altura = Double.parseDouble(leia.nextLine());

                    if (altura <= 0) {
                        System.out.println("Altura deve ser maior que zero.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número válido.");
                }
            }

            // Verificação do peso
            while (true) {
                try {
                    System.out.print("Peso (em kg): ");
                    peso = Double.parseDouble(leia.nextLine());

                    if (peso <= 0) {
                        System.out.println("Peso deve ser maior que zero.");
                    } else {
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Entrada inválida! Digite um número válido.");
                }
            }

            // Verifica se é a pessoa mais pesada
            if (peso > maiorPeso) {
                maiorPeso = peso;
                nomeMaisPesada = nome;
            }

            // Verifica se é a pessoa mais alta
            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeMaisAlta = nome;
            }
        }

        // Exibe os resultados
        System.out.printf("\n=== RESULTADOS ===\n  Pessoa mais pesada: %s (%.2f kg)\n  Pessoa mais alta: %s (%.2f m)", nomeMaisPesada, maiorPeso, nomeMaisAlta, maiorAltura);

    }
}
