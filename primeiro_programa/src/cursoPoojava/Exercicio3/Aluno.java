package cursoPoojava.Exercicio3;

import java.util.UUID;

public class Aluno {

    private String nome;
    private String cursoMatriculado;
    private UUID matricula = UUID.randomUUID();
    private double primeiraNota;
    private double segundaNota;
    private double terceiraNota;

    private boolean aprovado;

    private boolean reprovado;

     public Aluno(){

    }
    public void alunoAprovado(){
        if (getPrimeiraNota()>=7
            && getSegundaNota()>=7){
            System.out.println("Aprovado");
            isAprovado();
        }else if (getSegundaNota()>=7
                  && getTerceiraNota()>=7){
            System.out.println("Aprovado");
         isAprovado();
        } else if (getPrimeiraNota()>=7
                    &&getTerceiraNota()>=7) {
            System.out.println("Aprovado");
           isAprovado();

        }else {
            System.out.println("Reprovado");
            isReprovado();

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCursoMatriculado() {
        return cursoMatriculado;
    }

    public void setCursoMatriculado(String cursoMatriculado) {
        this.cursoMatriculado = cursoMatriculado;
    }

    public UUID getMatricula() {
        return matricula;
    }

    public void setMatricula(UUID matricula) {
        this.matricula = matricula;
    }

    public double getPrimeiraNota() {
        return primeiraNota;
    }

    public void setPrimeiraNota(double primeiraNota) {
        this.primeiraNota = primeiraNota;
     }

    public double getSegundaNota() {
        return segundaNota;
    }

    public void setSegundaNota(double segundaNota) {
        this.segundaNota = segundaNota;
    }

    public double getTerceiraNota() {
        return terceiraNota;
    }

    public void setTerceiraNota(double terceiraNota) {
        this.terceiraNota = terceiraNota;
    }

    public boolean isAprovado() {

        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public boolean isReprovado() {
        return reprovado;
    }

    public void setReprovado(boolean reprovado) {
        this.reprovado = reprovado;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", cursoMatriculado='" + cursoMatriculado + '\'' +
                ", matricula=" + matricula +
                ", primeiraNota=" + primeiraNota +
                ", segundaNota=" + segundaNota +
                ", terceiraNota=" + terceiraNota +


                '}';
    }
}
