import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça a opinião dos fãs de um determinado filme, sendo que o fã deve responder 1- Ótimo, 2- Bom, 3- Ruim. Ao final, mostrar:
- a. Quantos responderam ótimo e quanto isso representa em % de todos os respondentes
- b. Quantos responderam bom e quanto isso representa em % de todos os respondentes
- c. Quantos responderam ruim e quanto isso representa em % de todos os respondentes
- d. Quantas pessoas ao todo responderam
- e. Considerando que os usuários introduzem 1,2 ou 3, informar a média de notas do filme
- O programa deve sempre perguntar se o usuário deseja continuar após cada resposta. Sendo que, se digitar S - para sim, deve continuar, ao digitar N - para não, deve encerrar.
*/

        int otimo = 0, bom = 0, ruim = 0, totalRespostas = 0, somaNotas = 0;
        double porcentagemOtimo, porcentagemBom, porcentagemRuim, mediaNotas;
        String continuar;

        System.out.println("=== Pesquisa de Opinião sobre o Filme ===");

        do {
            int resposta = 0;

            // Validação da nota
            while (true) {
                try {
                    System.out.print("\nAvalie o filme (1 - Ótimo, 2 - Bom, 3 - Ruim): ");
                    resposta = leia.nextInt();

                    if (resposta >= 1 && resposta <= 3) {
                        break;
                    } else {
                        System.out.println("Digite apenas 1, 2 ou 3.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida! Digite um número inteiro.");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }

            // Contabiliza a resposta
            switch (resposta) {
                case 1:
                    otimo++;
                    break;
                case 2:
                    bom++;
                    break;
                case 3:
                    ruim++;
                    break;
            }

            totalRespostas++;    // Contador de pessoas que responderam a pesquisa
            somaNotas += resposta;

            // Pergunta se deseja continuar
            leia.nextLine();    // limpa o buffer
            while (true) {
                System.out.print("Deseja continuar? (S para sim / N para não): ");
                continuar = leia.nextLine().trim().toUpperCase();

                if (continuar.equals("S") || continuar.equals("N")) {
                    break;
                }
                else {
                    System.out.println("Digite apenas S ou N.");
                }
            }

        } while (continuar.equals("S"));

        // Cálculo das porcentagens
        porcentagemOtimo = (otimo * 100.0) / totalRespostas;
        porcentagemBom = (bom * 100.0) / totalRespostas;
        porcentagemRuim = (ruim * 100.0) / totalRespostas;
        mediaNotas = (double) somaNotas / totalRespostas;

        // Exibição dos resultados
        System.out.printf("\n=== RESULTADOS DA PESQUISA ===\n  a. Ótimo: %d votos (%.2f%%)\n  b. Bom: %d votos (%.2f%%)\n  c. Ruim: %d votos (%.2f%%)\n  d. Total de respondentes: %d\n  e. Média das notas: %.2f", otimo, porcentagemOtimo, bom, porcentagemBom, ruim, porcentagemRuim, totalRespostas, mediaNotas);

    }
}
