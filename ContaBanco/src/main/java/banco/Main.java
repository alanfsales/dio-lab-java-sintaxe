package banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContaTerminal ct = new ContaTerminal();

        System.out.println("Por favor, digite o número da conta! ");
        ct.setNumero(sc.nextInt());
        System.out.println("Por favor, digite o número da Agência! ");
        ct.setAgencia(sc.nextInt());
        System.out.println("Por favor, digite o Nome do Cliente! ");
        ct.setNomeCliente(sc.next());
        System.out.println("Por favor, digite o saldo! ");
        ct.setSaldo(sc.nextInt());

        System.out.println("Olá " + ct.getNomeCliente() +
                ", obrigado por criar uma conta em nosso banco, sua agência é "
                + ct.getAgencia() + ", conta " + ct.getNumero() + " e seu saldo "
                + ct.getSaldo() + " já está disponível para saque.");

    }
}