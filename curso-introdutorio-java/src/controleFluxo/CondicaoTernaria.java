package controleFluxo;

public class CondicaoTernaria {

    public static void main(String[] args) {
        double notaAprovado = 7;
        double primeiraNota = 1;
        double segundaNota= 6;
        double media = (primeiraNota + segundaNota)/2;

       /* String resultado = media >= notaAprovado ? "Aprovado" : "Reprovado";
        System.out.println(resultado);*/
        String resultado = media >=notaAprovado
                        ? "Aprovado" : media > 5  ?
                "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}
