import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar e capturar os dados do usuário
            System.out.println("Por favor, digite o número da Agência:");
            String agencia = scanner.nextLine();

            System.out.println("Por favor, digite o número da Conta:");
            int numero = scanner.nextInt();

            // Consumir a quebra de linha do nextInt
            scanner.nextLine();

            System.out.println("Por favor, digite o nome do Cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, digite o saldo inicial (use ponto ou vírgula para separar decimais):");
            String saldoInput = scanner.nextLine().replace(",", "."); // Substituir vírgula por ponto

            // Converter o saldo para double
            double saldo = Double.parseDouble(saldoInput);

            // Exibir a mensagem formatada
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
            System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Erro: formato de entrada inválido. Certifique-se de usar o ponto ou a vírgula para separar os decimais.");
        } finally {
            // Fechar o scanner
            scanner.close();
        }
    }
}
