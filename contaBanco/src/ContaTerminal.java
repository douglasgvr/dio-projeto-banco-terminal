import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // [] Conhecer e importa a classe Scanner,
        // [] Exibir as mensagens para o usuário,
        // [] Obter pela Scanner os valores digitados no terminal,
        // [] Exibir a mensagem no terminal para o usuario,

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o numero da agencia: ");
        String numeroAgencia = entrada.next();
        System.out.println("Agencia: " + numeroAgencia);

        System.out.println("Digite o numero da conta: ");
        int numeroConta = entrada.nextInt();
        System.out.println("Conta: " + numeroConta);

        System.out.println("Digite o Nome do Cliente: ");
        String nomeCliente = entrada.next();
        System.out.println("Nome do Cliente: " + nomeCliente);

        System.out.println("Digite o numero da Saldo: ");
        double saldo = entrada.nextDouble();
        System.out.println("Saldo: " + saldo);

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %2f já está disponível para saque",
                nomeCliente, numeroAgencia, numeroConta, saldo);

        entrada.close();
    }
}
