import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Elabore 02 perguntas com 03 alternativas de resposta cada.
- O programa deverá perguntar ao usuário se ele quer responder a pergunta 01 ou 02.
- Exiba a pergunta e as alternativas correspondentes.
- Caso o usuário acerte a resposta, informe “Você acertou, pode retirar seu bônus na Shostners and Shostners”.
- Caso a pessoa erre, informar “Você não acertou, mas tente novamente numa próxima”.
- Desafio: você deve considerar que o usuário poderá responder “a” ou “A” para a resposta, por exemplo.
  Mas, no seu código, considere mininimzar a resposta do usuário sempre.
  Pesquise o método da classe String que transforma o texto em minúsculo.
*/

        String alternativa = "";
        int pergunta;

        // Verificação de escolha de pergunta
        while (true) {
            System.out.println("=== PERGUNTAS E RESPOSTAS ====");
            System.out.println("\nEscolha entre duas perguntas:");
            System.out.println("1 - Quanto tempo a Terra demora para dar uma volta completa em torno dela mesma?");
            System.out.println("2 - Quais são as fases da Lua?");

            try {
                System.out.print("\nInforme qual pergunta você deseja responder (1 ou 2): ");
                pergunta = leia.nextInt();
                leia.nextLine(); // limpa o buffer

                // Perguntas disponíveis
                if (pergunta == 1) {
                    System.out.println("\nQuanto tempo a Terra demora para dar uma volta completa em torno dela mesma?");
                    System.out.println("a - Aproximadamente 24 horas");
                    System.out.println("b - Aproximadamente 7 dias");
                    System.out.println("c - Aproximadamente 1 ano");
                }
                else if (pergunta == 2) {
                    System.out.println("\nQuais são as fases da Lua?");
                    System.out.println("a - Nova, crescente, cheia e minguante.");
                    System.out.println("b - Nova, cheia, minguante e crescendo.");
                    System.out.println("c - Nova, crescente, cheia, minguante e lua de sangue");
                }
                else {
                    System.out.println("\nDigite apenas 1 ou 2. Tente novamente!\n");
                    continue;
                }

                // Verificação de resposta correta
                System.out.print("\nQual é a resposta correta ('a', 'b' ou 'c')? ");
                alternativa = leia.nextLine().trim().toLowerCase();

                if (alternativa.isEmpty()) {
                    System.out.println("\nO campo está vazio. Tente novamente!");
                    continue;
                }

                if (pergunta == 1 && alternativa.equals("a") || pergunta == 2 && alternativa.equals("a")) {
                    System.out.println("\nVocê acertou, pode retirar seu bônus na Shostners and Shostners");
                }
                else if (alternativa.equals("b") || alternativa.equals("c")) {
                    System.out.println("\nVocê não acertou, mas tente novamente numa próxima.");
                }
                else {
                    System.out.println("\nDigite apenas a, b ou c!");
                }

                break;

            } catch (InputMismatchException e) {
                System.out.println("\nDigite apenas números inteiros. Tente novamente!\n");
                leia.nextLine(); // limpa o buffer
            }
        }
    }
}