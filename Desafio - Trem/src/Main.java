import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

/*
Suponha que dois trens partam ao mesmo tempo de cidades diferentes, de maneira que em algum momento eles irão colidir.
Você não pode fazer nada para impedir a tragédia, a única coisa que você pode fazer é determinar o instante e o local que colidem.
*/

        while (true) {
            System.out.println("=== COLISÃO DE TRENS ===\n== Posições");

            String entradaPosicaoTremA, entradaPosicaoTremB, entradaVelocidadeTremA, entradaVelocidadeTremB;
            int posicaoTremA, posicaoTremB, velocidadeTremA, velocidadeTremB;



            // Verificação das posições
            // Verificação de posição trem A
            while (true) {
                try {
                    System.out.print(" * Informe a posição do trem A (0 a 10.000): ");
                    entradaPosicaoTremA = leia.nextLine();

                    // Verificação de campo preenchido
                    if (entradaPosicaoTremA.isEmpty()) {
                        System.out.print("O campo não pode ficar vazio. Informe um valor de 0 a 10.000 e tente novamente!\n");
                    } else {
                        posicaoTremA = Integer.parseInt(entradaPosicaoTremA);    // Transforma String em int

                        // Verificação do valor válido das posições
                        if (posicaoTremA < 0 || posicaoTremA > 10000) {    // Garante que a a posição fique entre 0 e 10.000
                            System.out.println("Posição informada inválida. Tente novamente!\n");
                        } else {
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Informe apenas números inteiros. Tente novamente!\n");
                }
            }

            // Verificação de posição trem B
            while (true) {
                try {
                    System.out.print(" * Informe a posição do trem B (0 a 10.000): ");
                    entradaPosicaoTremB = leia.nextLine();

                    // Verificação de campo preenchido
                    if (entradaPosicaoTremB.isEmpty()) {
                        System.out.print("O campo não pode ficar vazio. Informe um valor de 0 a 10.000 e tente novamente!\n");
                    } else {
                        posicaoTremB = Integer.parseInt(entradaPosicaoTremB);    // Transforma String em int

                        // Verificação do valor válido das posições
                        if (posicaoTremB < 0 || posicaoTremB > 10000) {    // Garante que a a posição fique entre 0 e 10.000
                            System.out.println("Posição informada inválida. Tente novamente!\n");
                        } else {
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Informe apenas números inteiros. Tente novamente!\n");
                }
            }

            System.out.print("== Velocidades");

            // Verificação das velocidades
            // Velocidade trem A
            while (true) {
                try {
                    System.out.print(" * Informe a velocidade do trem A em km (0 a 300): ");
                    entradaVelocidadeTremA = leia.nextLine();

                    // Verificação de campo preenchido
                    if (entradaVelocidadeTremA.isEmpty()) {
                        System.out.print("O campo não pode ficar vazio. Informe um valor de 0 a 300 km e tente novamente!\n");
                    } else {
                        velocidadeTremA = Integer.parseInt(entradaVelocidadeTremA);    // Transforma String em int

                        // Verificação do valor válido das posições
                        if (velocidadeTremA < 0 || velocidadeTremA > 300) {    // Garante que a velocidade sempre seja positiva
                            System.out.println("Velocidade informada inválida. Tente novamente!\n");
                        } else {
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Informe apenas números positivos de 0 a 300. Tente novamente!\n");
                }
            }

            // Velocidade trem B
            while (true) {
                try {
                    System.out.print(" * Informe a velocidade do trem B em km (-300 a 0): ");
                    entradaVelocidadeTremB = leia.nextLine();

                    // Verificação de campo preenchido
                    if (entradaVelocidadeTremB.isEmpty()) {
                        System.out.print("O campo não pode ficar vazio. Informe um valor de -300 a 0 km e tente novamente!\n");
                    } else {
                        velocidadeTremB = Integer.parseInt(entradaVelocidadeTremB);    // Transforma String em int

                        // Verificação do valor válido das posições
                        if (velocidadeTremB < -300 || velocidadeTremB > 0) {    // Garante que a velocidade sempre seja negativa
                            System.out.println("Velocidade informada inválida. Tente novamente!\n");
                        } else {
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Informe apenas números inteiros de -300 a 0. Tente novamente!\n");
                }
            }



        }
    }
}