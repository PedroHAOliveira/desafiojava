public class Desafio {
    public static void main(String[] args) {
        // Dados do cliente
        String nome = "Clark Kent";
        String tipoConta = "Corrente";
        double saldo = 1599.99;

        // Criar Scanner para ler entradas
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // Mostrar dados iniciais
        System.out.println("***********************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("***********************");

        // Laço para escolher opções
        while (true) {
            System.out.println("Operações");
            System.out.println("1- Consultar saldo");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferir valor");
            System.out.println("4- Sair");
            System.out.print("Digite a opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo: " + saldo);
            } else if (opcao == 2) {
                System.out.print("Valor a receber: ");
                double valor = scanner.nextDouble();
                saldo = saldo + valor;
                System.out.println("Saldo atualizado: " + saldo);
            } else if (opcao == 3) {
                System.out.print("Valor a transferir: ");
                double valor = scanner.nextDouble();
                if (valor <= saldo) {
                    saldo = saldo - valor;
                    System.out.println("Saldo atualizado: " + saldo);
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
