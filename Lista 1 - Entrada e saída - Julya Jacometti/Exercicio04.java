import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Peça ao usuário um número inteiro. A partir dessa entrada, mostre na tela:
- O número, seu antecessor e seu sucessor. Ex.: “O número informado foi 30, o antecessor é 29 e o sucessor é 31”.
*/

        int numero;

        while (true) {
            try {
                System.out.print("Olá! Informe um número inteiro para saber seu antecessor e o seu sucessor.\nNúmero: ");
                numero = leia.nextInt();
                break;
            } catch (NumberFormatException | InputMismatchException e) {
                System.out.println("O número que você informou não é válido. Tente novamente!");
                leia.nextLine();    // Limpeza da tentativa iválida
            }
        }


        System.out.printf("\nNúmero informado: %d\nSucessor: %d\nAntecessor: %d", numero, (numero + 1), numero - 1);
    }
}
