import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Uma companhia de carros paga a seus empregados um salário de R$ 1500,00 por mês mais uma comissão de R$ 350,00 para cada carro vendido e mais 0,001% do valor total das vendas da loja naquele mês.
- Calcule o salário do vendedor num dado mês recebendo como dados de entrada o nome do vendedor, o mês, o número de carros vendidos por ele e o valor total das vendas.
- Faça uma saída de dados adequada ao vendedor, mostrando os dados informados e calculados.
*/
        String nomeVendedor;
        int mes, carrosVendidos;
        double valorTotalVendas, bonusVendas, comissao, salario;

        // Dados do vendedor
        // Verificação do nome
        while (true) {
            System.out.println("=== CÁLCULO DE SALÁRIO ===\nPara realizar o cálculo, informe:");
            System.out.print("  Nome do vendedor: ");
            nomeVendedor = leia.nextLine();
            // Regex que verifica se só existem letras e acentos na String informada
            if (nomeVendedor.matches("[A-Za-zÀ-ÿ\\s'-]+")) {
                break;
            }
            else {
                System.out.println("O nome inserido é inválido, números e caracteres especiais não são permitidos. Tente novamente!");
            }
        }

        // Verificação do mês
        while (true) {
            try {
                System.out.print("  Mês (1 a 12): ");
                mes = leia.nextInt();
                if (mes >= 1 && mes < 13) {
                    break;
                }
                else {
                    System.out.println("Insira números de 1 a 12. Tente novamente!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação do número de carros vendidos
        while (true) {
            try {
                System.out.print("  Número de carros vendidos: ");
                carrosVendidos = leia.nextInt();
                if (carrosVendidos < 0) {
                    System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!");
                }
                else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!");
                leia.nextLine();
            }
        }

        // Verificação do valor total das vendas
        while (true) {
            try {
                System.out.print("  Valor total das vendas: ");
                valorTotalVendas = leia.nextDouble();
                if (valorTotalVendas >= 0) {
                    break;
                }
                else {
                    System.out.println("Insira apenas números positivos (maior ou igual a zero). Tente novamente!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Cálculo do salário
        comissao = 350 * carrosVendidos;
        bonusVendas = valorTotalVendas * 0.00001;
        salario = 1500 + comissao + bonusVendas;

        // Mostrando as informações para o colaborador
        System.out.printf("\n=== SALÁRIO DO COLABORADOR ===\n  Nome: %s\n  Mês trabalhado: %d\n  Carros vendidos: %d\n  Vendas totais: %.2f\n  Comissão: %.2f\n  Bônus de vendas: %.2f\n  SALÁRIO DO MÊS: %.2f", nomeVendedor, mes, carrosVendidos, valorTotalVendas, comissao, bonusVendas, salario);
    }
}