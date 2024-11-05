import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        double saldo = 2500;
        String dadosDoCliente = """
                *****************************
                Dados inicias do CLiente:
                Nome: Navarro Rangel 
                Tipo de conta: Corrente
                Saldo inicial: R$ %.2f
                *****************************
                """.formatted(saldo);
        System.out.println(dadosDoCliente);
        Scanner scanner = new Scanner(System.in);
        int menuOpcao = -1;

        while (menuOpcao != 0){
            System.out.println("Escolha a opção Desejada");
            System.out.println("1- Ver Saldo");
            System.out.println("2- Depositar");
            System.out.println("3- Sacar");
            System.out.println("0- Sair");
            menuOpcao = scanner.nextInt();
            switch (menuOpcao){
                case 1:
                    System.out.printf("Seu saldo atual é: R$ %.2f", saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor do deposito");
                    double deposito = scanner.nextDouble();

                    if (deposito < 0){
                        System.out.println("Não é possível sacar valores negativos");
                    }else {
                        saldo += deposito;
                        System.out.printf("Deposito de R$ %.2f realizado. Novo saldo: R$ %.2f%n", deposito,saldo);
                    }
                    break;


                case 3:
                    System.out.println("Digite o valor do saque!");
                    double saque = scanner.nextDouble();
                    if(saldo >= saque){
                        saldo -= saque;
                        System.out.printf("Saque de R$ %.2f realizado. Novo saldo: R$ %2.2f%n", saque,saldo);
                    }else {
                        System.out.println("Você nao possui saldo suficiente!");
                    }
                    break;


                case 0:
                    System.out.println("Fechando programa, obrigado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente");
            }
        }
        scanner.close();
    }
}
