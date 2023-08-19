package controleFluxo;

public class CaixaEletromico {

    public static void main(String[] args) {
        double saldo =250.00;
        double valorSolcitado = 270.00;

        if (valorSolcitado < saldo){
            saldo -= valorSolcitado;
            System.out.println(saldo);
        }else {
            System.out.println("Saldo insuficiente");
        }


    }
}
