package controleFluxo;

public class CondicionailEncadeada {

    public static void main(String[] args) {
        double notaAprovado = 7;
        double primeiraNota = 10;
        double segundaNota= 4;
        double media = (primeiraNota + segundaNota)/2;

        if (media >=notaAprovado){
            System.out.println("Você esta aprovado");
        }else if (media>=5) {
            System.out.println("Recuperação");
        }else {
            System.out.println("Reprovado");
        }
    }
}
