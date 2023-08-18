import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        String nomeCliente="";
        String agencia;
        int numeroConta;
        double saldoConta;
        Mensagem mensagem = new Mensagem();
        String prosseguir = mensagem.mensagemPadrao();


        System.out.println("Bem Vindo ao Banco BR3");
        System.out.println("------------------------");
        System.out.println("Por favor digite seu nome ");
        System.out.println(prosseguir);
        nomeCliente = teclado.next();
        System.out.println("------------------------");
        System.out.println("Por favor digite o numero da Conta, sem pontos e sem vírgula");
        System.out.println(prosseguir);
        numeroConta = teclado.nextInt();
        System.out.println("------------------------");
        System.out.println("Por favor digite a conta, pode conter traços");
        System.out.println(prosseguir);
        agencia = teclado.next();
        System.out.println("------------------------");
        System.out.println("Qual saldo inicial da sua conta");
        System.out.println(prosseguir);
        saldoConta = teclado.nextDouble();
        System.out.println("------------------------");

        System.out.println("*****************************************************************");
        System.out.println("Ola "+nomeCliente+ "obrigado por criar uma conta em  nosso banco");
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.println("Esses são os dados da sua conta ");
        System.out.println("Sua agencia é  "+ agencia);
        System.out.println("Conta "+numeroConta);
        System.out.println("Saldo "+ saldoConta);
        System.out.println("Lembro que seu saldo já está dispponível para saque");
        System.out.println("*****************************************************************");
        System.out.println("*****************************************************************");
        System.out.println("Obrigado");



    }


}
