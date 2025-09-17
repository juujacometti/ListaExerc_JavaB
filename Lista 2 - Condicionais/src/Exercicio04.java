import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Pergunte ao usuário onde ele pretende passar suas férias.
- Maceió: +100% com almoço/janta, +85% sem /  Porto de Galinhas: +60% com almoço/janta, +45% sem.
- Além disso, o programa deve perguntar se ele deseja o valor com almoço/janta incluso ou não e mostrar o valor final da viagem na tela.
- O valor base de cálculo para todas as viagens é de R$3000,00.
- (Atente-se aos códigos/números que deverão ser usados para fazer as condições no programa):
*/

        String destino;
        int escolhaDestino, escolhaPacote;
        double maceio, maceioIncluso, porto, portoIncluso;

        // Cálculo dos valores
        maceio = 3000 + (0.85 * 3000);
        maceioIncluso = 3000 * 2;
        porto = 3000 + (3000 * 0.45);
        portoIncluso = 3000 + (3000 * 0.6);

        System.out.printf("=== PACOTE DE VIAGEM ===\n");

        // Verificação de escolha destino
        while (true) {
            try {
                System.out.printf("Escolha o DESTINO:\n  1 -> Maceió\n    - Com almoço e janta incluso: R$ %.2f\n    - Sem almoço e janta incluso: R$ %.2f\n\n  2 -> Porto de Galinhas\n    - Com almoço e janta incluso: R$ %.2f\n    - Sem almoço e janta incluso: R$ %.2f\n\nInforme o número da opção referente ao destino: ", maceioIncluso, maceio, portoIncluso, porto);
                escolhaDestino = leia.nextInt();

                if (escolhaDestino == 1) {
                    destino = "Maceió";

                    // Verificação de pacote - Maceio
                    while (true) {
                        try {
                            System.out.print("\nQual PACOTE você deseja:\n  1 -> Almoço e janta incluso\n  2 -> Sem almoço e janta incluso\nInforme o número da opção desejada: ");
                            escolhaPacote = leia.nextInt();

                            if (escolhaPacote == 1) {
                                System.out.printf("\n=== CONFIRMAÇÃO DE ESCOLHA ===\n  Destino: %s\n  Pacote: Almoço e janta incluso - SIM\n  TOTAL: %.2f", destino, maceioIncluso);
                                break;
                            }
                            else if (escolhaPacote == 2) {
                                System.out.printf("\n=== CONFIRMAÇÃO DE ESCOLHA ===\n  Destino: %s\n  Pacote: Almoço e janta incluso - NÃO\n  TOTAL: %.2f", destino, maceio);
                                break;
                            }
                            else {
                                System.out.print("Escolha inválida. Digite apenas 1 ou 2.\n");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Insira apenas números. Tente novamente!\n");
                            leia.nextLine();    // Limpeza da tentativa inválida
                        }
                    }
                    break;
                }

                else if (escolhaDestino == 2) {
                    destino = "Porto de Galinhas";

                    // Verificação do pacote - Porto
                    while (true) {
                        try {
                            System.out.print("Qual pacote você deseja:\n  1 -> Almoço e janta incluso\n  2 -> Sem almoço e janta incluso\nInforme o número da opção desejada: ");
                            escolhaPacote = leia.nextInt();

                            if (escolhaPacote == 1) {
                                System.out.printf("\n=== CONFIRMAÇÃO DE ESCOLHA ===\n  Destino: %s\n  Pacote: Almoço e janta incluso - SIM\n  TOTAL: R$ %,.2f\n", destino, portoIncluso);
                                break;
                            } else if (escolhaPacote == 2) {
                                System.out.printf("\n=== CONFIRMAÇÃO DE ESCOLHA ===\n  Destino: %s\n  Pacote: Almoço e janta incluso - NÃO\n  TOTAL: R$ %,.2f\n", destino, porto);
                                break;
                            } else {
                                System.out.print("Escolha inválida. Digite apenas 1 ou 2.\n");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Insira apenas números. Tente novamente!\n");
                            leia.nextLine();
                        }
                    }
                    break;
                }

                else {
                    System.out.print("Escolha inválida. Digite apenas 1 ou 2.\n");
                }
            } catch (InputMismatchException e) {
                System.out.println("Insira apenas números. Tente novamente!\n");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }
    }
}
