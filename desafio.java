import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        // Dados do cliente
        String nome = "Jacqueline Oliveira";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        // Criar Scanner para ler entradas
        Scanner scanner = new Scanner(System.in);

        // Mostrar dados iniciais
        System.out.println("***********************");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo inicial: R$ " + saldo);
        System.out.println("***********************");

        // Laço para o menu
        while (true) {
            // Mostrar opções
            System.out.println("\nOperações");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();

            // Verificar a opção escolhida
            if (opcao == 1) {
                System.out.println("Saldo: R$ " + saldo);
            } else if (opcao == 2) {
                System.out.print("Valor a receber: ");
                double valor = scanner.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atualizado: R$ " + saldo);
            } else if (opcao == 3) {
                System.out.print("Valor a transferir: ");
                double valor = scanner.nextDouble();
                if (valor <= saldo) {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado: R$ " + saldo);
                } else {
                    System.out.println("Saldo insuficiente!");
                }
            } else if (opcao == 4) {
                System.out.println("Tchau!");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
