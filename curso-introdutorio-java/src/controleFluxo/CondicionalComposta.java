package controleFluxo;

public class CondicionalComposta {
    public static void main(String[] args) {
        double notaAprovado = 7;
        double primeiraNota = 8;
        double segundaNota= 4;
        double media = (primeiraNota + segundaNota)/2;

        if (media >= notaAprovado){
            System.out.println("Você esta aprovado");
        }else {
            System.out.println("Você esta reprovado");
        }

    }
}
