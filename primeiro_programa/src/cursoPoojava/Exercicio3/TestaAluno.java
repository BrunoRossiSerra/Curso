package cursoPoojava.Exercicio3;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.UUID;

public class TestaAluno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.println("Digite o nome ");
        a.setNome(teclado.next());
        System.out.println("Qual o curso");
        a.setNome(teclado.next());
        System.out.println("Digite Primeira nota");
        a.setPrimeiraNota(teclado.nextDouble());
        System.out.println("Digite Segunda nota");
        a.setSegundaNota(teclado.nextDouble());
        System.out.println("Terceira Nota");
        a.setTerceiraNota(teclado.nextDouble());
        a.alunoAprovado();
        System.out.println(a.toString());



       /* a.setPrimeiraNota(7);
        a.setSegundaNota(4);
        a.setTerceiraNota(9);
        System.out.println(a.getMatricula());
        a.alunoAprovado();/*

        */

    }
}
