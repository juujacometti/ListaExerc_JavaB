
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
- Solicite os dados de cadastro de uma pessoa para uma futura vaga de emprego na Bosch.
- É necessário solicitar: nome, sobrenome, data de nascimento, pretensão salarial, grau de instrução (ensino médio, ensino técnico ou ensino superior),
  cargo pretendido e se a pessoa possui CNH do tipo B (sim ou não).
- Após solicitar os dados ao usuário, uma mensagem informando todos os dados solicitados e confirmando o cadastro deve ser exibida ao usuário.
*/

        // Variáveis
        String nome, sobrenome, dataNascimento, grauEnsino = "", cargoPret, cnh;
        int escolhaGrauEnsino, cadastroOk;
        double pretSalarial;

        // API para formatar datas
        DateTimeFormatter formatacaoDatas = DateTimeFormatter.ofPattern("dd/MM/yyyy");    // Definindo o formato da data
        LocalDate dataNascFormatada = null;    // Declaração do formato da data

        System.out.println("Olá! Para realizar o seu cadastro na vaga, informe:");

        while (true) {
            // Solicitação das informações para o usuário
            System.out.print("Nome: ");
            nome = leia.nextLine();
            System.out.print("Sobrenome: ");
            sobrenome = leia.nextLine();

            // Verificação de data
            while (true) {
                try {
                    System.out.print("Data de nascimento (seguir formato - dia/mes/ano): ");
                    dataNascimento = leia.nextLine();
                    dataNascFormatada = LocalDate.parse(dataNascimento, formatacaoDatas);
                    break;
                }
                catch (DateTimeParseException e) {
                    System.out.println("Data inválida. Informe novamente!");
                }
            }

            // Verificação de pretenção salarial
            while (true) {
                try {
                    System.out.print("Pretenção salarial: ");
                    pretSalarial = leia.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Valor informado inválido. Tente novamente!");
                    leia.nextLine();    // Limnpeza da tentativa inválida para evitar looping infinito
                }
            }

            leia.nextLine();    // Limpeza do cache

            // Verificação de grau de ensino
            while (true) {
                try {
                    System.out.print("Grau de ensino\n 1 -> Ensino Médio\n 2 -> Ensino Técnico\n 3 -> Ensino Superior\nNúmero da opção: ");
                    escolhaGrauEnsino = leia.nextInt();
                    leia.nextLine();    // Limpeza do cache

                    // Separação das informações
                    // Grau de ensino
                    if (escolhaGrauEnsino == 1) {
                        grauEnsino = "Ensino Médio";
                        break;
                    }
                    else if (escolhaGrauEnsino == 2) {
                        grauEnsino = "Ensino Técnico";
                        break;
                    }
                    else if (escolhaGrauEnsino == 3) {
                        grauEnsino = "Ensino Superior";
                        break;
                    }
                    else {
                        System.out.println("Opção inválida. Digite apenas 1, 2 ou 3!");
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Opção inválida. Tente novamente!");
                    leia.nextLine();    // Limpeza da opção inválida
                }
            }

            System.out.print("Cargo pretendido: ");
            cargoPret = leia.nextLine();

            // Verificação de CNH
            while (true) {
                System.out.print("Possui CNH tipo B (S/N): ");
                cnh = leia.nextLine().trim();

                if (cnh.equalsIgnoreCase("S")) {
                    cnh = "Sim";
                    break;
                }
                else if (cnh.equalsIgnoreCase("N")) {
                    cnh = "Não";
                    break;
                }
                else {
                    System.out.println("Informe uma opção válida. Digite apenas 'S' para SIM e 'N' para NÃO!");
                }
            }

            // Mostrando informações para o usuário
            System.out.printf("\n=== SUAS INFORMAÇÕES ===\nNome: %s\nSobrenome: %s\nData: " + dataNascFormatada.format(formatacaoDatas) + "\nPretenção salarial: %.2f\nGrau de ensino: %s\nCargo pretendido: %s\nCNH tipo B: %s", nome, sobrenome, pretSalarial, grauEnsino, cargoPret, cnh);

            // Confirmação das informações
            while (true) {
                try {
                    System.out.println("\nSuas informações estão corretas?\n 1 -> Sim\n 2 -> Não\nInforme o número da opção: ");
                    cadastroOk = leia.nextInt();
                    leia.nextLine();    // Limpeza do cache

                    if (cadastroOk == 1) {
                        System.out.println("\n*** Seu cadastro foi concluído! ***");
                        return;    // Encerra o programa
                    }
                    else if (cadastroOk == 2) {
                        System.out.println("\n*** Corrija seu cadastro ***");
                        break;
                    }
                    else {
                        System.out.println("Opção inválida. Informe 1 ou 2.");
                    }
                } catch (Exception e) {
                    System.out.println("Opção inválida. Informe apenhas números!");
                    leia.nextLine();    // Limpeza da entrada inválida para não gerar looping infinito
                }
            }
        }
    }
}