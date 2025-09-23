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

            String entradaPosicaoTremA, entradaPosicaoTremB, entradaVelocidadeTremA, entradaVelocidadeTremB, horarioFormatado;
            int posicaoTremA, posicaoTremB, velocidadeTremA, velocidadeTremB, horaPartida = 17, segundosHoraPartida, colisaoSegundos, totalSegundosDia, horas, minutos, segundos, escolha;
            double tempo, kmColisao, tempoSegundos;



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
                            System.out.println("O número deve ser maior ou igual a zero e menor que 10.000. Tente novamente!\n");
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

            System.out.print("== Velocidades\n");


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
                            System.out.println("A velocidade do trem A sempre será positiva. Tente novamente!\n");
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
                            System.out.println("A velocidade do trem B sempre será negativa. Tente novamente!\n");
                        }
                        else {
                            break;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.print("Informe apenas números inteiros de -300 a 0. Tente novamente!\n");
                }
            }

            // Situação de não colisão
            if (posicaoTremA > posicaoTremB) {
                System.out.println("\nNÃO HAVERÁ COLISÃO entre os trens, pois os mesmos estão em rotas de afastamento.");
            }
            // Situação de colisão
            else {
                // Cálculos
                // Tempo: t = (S0a - S0b) / (Vb - Va) - em horas
                tempo = (double) (posicaoTremA - posicaoTremB) / (velocidadeTremB - velocidadeTremA);

                // Posição da colisão: Sa(t) = S0a + Va * t
                kmColisao = posicaoTremA + velocidadeTremA * tempo;

                // Conversão do tempo (horas) para segundos
                tempoSegundos = tempo * 3600;  // transforma horas em segundos

                // Conversão da hora de partida em segundos para realizar o calculo em medidas iguais
                segundosHoraPartida = horaPartida * 3600;    // 17h - 61200 segundos

                // Somar o tempo da colisão (que já foi onvertido para segundos)
                colisaoSegundos = (int) tempoSegundos + segundosHoraPartida;
                colisaoSegundos = colisaoSegundos % 86400;    // Garante que o programa não ultrapasse as 24h

                // Quebra do horário em horas, minutos e segundos
                horas = colisaoSegundos / 3600;
                minutos = (colisaoSegundos % 3600) / 60;
                segundos = colisaoSegundos % 60;

                // Formatação do horário para 00:00:00
                horarioFormatado = String.format("%02d:%02d:%02d", horas, minutos, segundos);


                // Demonstração para o usuário
                System.out.printf("A colisão de trens acontecerá no KM %.0f e ocorrerá" + " após %.0f segundos no horário de %s.\n", kmColisao, tempoSegundos, horarioFormatado);
            }


            // Confirmação se o usuário deseja continuar o programa
            while (true) {
                try {
                    System.out.print("\nVocê deseja realizar outra verificação?\n  1 - Sim\n  2 - Não\nInforme o número da opção: ");
                    escolha = leia.nextInt();
                    leia.nextLine();    // Limpeza do buffer

                    if (escolha < 1 || escolha > 2) {
                        System.out.println("Informe uma opção válida, 1 para sim ou 2 para não. Tente novamente!\n");
                    }
                    else {
                        if (escolha == 1) {
                            System.out.println("Repetindo o programa...\n");
                            break;
                        }
                        else {
                            System.out.println("Encerrando o programa...");
                            return;
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Insira apenas 1 ou 2. Tente novamente!\n");
                    leia.nextLine();    // Limpeza da tentativa inválida
                }
            }
        }
    }
}