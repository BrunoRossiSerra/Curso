package cursoPoojava.exercicio1;

import java.util.Scanner;

public class TesteExercicio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
           Aluno a1 = new Aluno();
           a1.setPrimeiraNota(10);
           a1.setSegundaNota(9);
           a1.setNotaTrabalho(7);
           //a1.aprovado();

        System.out.println(a1.getNotaTrabalho());
        System.out.println(a1.getSegundaNota());
        System.out.println(a1.getPrimeiraNota());
        System.out.println(a1.calculaMedia());
        System.out.println(a1.aprovado());



    }

}
