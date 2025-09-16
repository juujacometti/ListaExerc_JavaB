import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça ao usuário um horário, solicitando, separadamente:
- Quantidade de horas, a quantidade de minutos e a quantidade de segundos.
- Ao final, mostre esse horário em segundos.
*/

        int hora, minuto, segundo, segundosTotais;

        System.out.println("Olá! Para converter o horário desejado em segundos, informe:");

        // Verificação de hora
        while (true) {
            try {
                System.out.print("  Hora(s) (0 a 24): ");
                hora = leia.nextInt();
                if (hora >= 0 && hora < 24) {
                    break;
                }
                else if (hora == 24) {
                    hora = 0;
                    break;
                }
                else {
                    System.out.println("Informe um tempo em horas de 0 a 24.");
                }
            } catch (NumberFormatException |InputMismatchException e) {
                System.out.println("Informe um tempo em horas válido. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação de minuto
        while (true) {
            try {
                System.out.print("  Minuto(s) (0 a 59): ");
                minuto = leia.nextInt();
                if (minuto >= 0 && minuto < 60) {
                    break;
                }
                else {
                    System.out.println("Informe um tempo em minutos de 0 a 59.");
                }
            } catch (NumberFormatException |InputMismatchException e) {
                System.out.println("Informe um tempo em minutos válido. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Verificação de segundo
        while (true) {
            try {
                System.out.print("  Segundo(s) (0 a 59): ");
                segundo = leia.nextInt();
                if (segundo >= 0 && segundo < 60) {
                    break;
                }
                else {
                    System.out.println("Informe um tempo em segundos de 0 a 59.");
                }
            } catch (NumberFormatException |InputMismatchException e) {
                System.out.println("Informe um tempo em segundos válido. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa inválida
            }
        }

        // Conversão do tempo para segundos
        segundosTotais = (hora * 3600) + (minuto * 60) + segundo;

        System.out.printf("O tempo que você informou foi: %d:%d:%d\nTempo em segundos: %d", hora, minuto, segundo, segundosTotais);
    }
}
