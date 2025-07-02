import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo ao Banco JTAA.");
        System.out.println("Por favor, nos informe o número de conta! :D");
        var account = scanner.nextInt();
        System.out.println();

        System.out.println("Show! E qual é a agência? ;)");
        var agency = scanner.next();
        System.out.println();

        System.out.println("Poderia me dizer seu nome, por favor?");
        var name = scanner.next();
        System.out.println();

        System.out.println("E por último, qual o seu saldo?");
        var balance = scanner.nextBigDecimal();
        System.out.println();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, " +
                "conta %s e seu saldo R$%s já está disponível para saque.", name, agency, account, balance);
    }
}
