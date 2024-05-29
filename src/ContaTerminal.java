import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        System.out.println("Por favor, digite seu nome:");
        nomeCliente = sc.next();
        System.out.println("Por favor, digite o número da agência (Ex: 6020-0):");
        agencia = sc.next();
        System.out.println("Por favor, digite o número da conta (Ex: 23333):");
        numero = sc.nextInt();
        System.out.println("Por favor, digite o saldo inicial:");
        saldo = sc.nextFloat();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque!");
    }
}
