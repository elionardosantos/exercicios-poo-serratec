import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double saldo = 0;
        double valorDeposito = 0;
        double valorSaque = 0;
        double valorSaqueMaximo = 1000;
        int quantMaxSaques = 3;
        int opcao;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print(
                "\n---------- Menu ----------" +
                "\nEscolha uma das opcoes abaixo:" +
                "\n1. Ver saldo" +
                "\n2. Depositar" +
                "\n3. Sacar" +
                "\n0. Sair" +
                "\n> "
            );

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n---------- Saldo ---------");
                    System.out.printf("Saldo: R$ %.2f\n", saldo);
                    break;

                case 2:
                    System.out.println("\n-------- Deposito --------");
                    System.out.print("Quanto voce deseja depositar? R$ ");

                    valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;

                    System.out.println("--------------------------");
                    System.out.println("Deposito realizado com sucesso");
                    System.out.printf("Novo saldo: R$ %.2f\n", saldo);
                    break;

                case 3:
                    if(quantMaxSaques <= 0){
                        System.out.println(
                                "--------------------------" +
                                "\nLimite de saques diarios atingido."
                        );
                        break;
                    }

                    System.out.print("\n---------- Saque ---------");

                    do {
                        if(valorSaque > valorSaqueMaximo){
                            System.out.printf("O limite maximo por saque e de R$ %.2f. Tente um valor menor.", valorSaqueMaximo);
                        }
                        System.out.print("\nQuanto voce deseja sacar? R$ ");
                        valorSaque = scanner.nextDouble();

                    } while (valorSaque > valorSaqueMaximo);

                    if(valorSaque > saldo){
                        System.out.println("Saldo insuficiente. Saque nao realizado.");
                        break;
                    }

                    saldo -= valorSaque;
                    quantMaxSaques--;

                    System.out.println("--------------------------");
                    System.out.println("Saque realizado com sucesso");
                    System.out.printf("Novo saldo: R$ %.2f\n", saldo);
                    break;

                case 0:
                    System.out.print(
                            "--------------------------" +
                            "\n---- Acesso encerrado ----" +
                            "\n"
                    );
                    break;

                default:
                    System.out.print(
                            "--------------------------" +
                            "\nOpcao invalida. Tente novamente.\n"
                    );
                    break;
            }

        } while (opcao != 0);
        scanner.close();
    }
}
