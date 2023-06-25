package cursoPoojava.exercicio1;

public class Aluno {

    private String nome;
    private int matricula;
    private double primeiraNota;
    private double segundaNota;
    private double notaTrabalho;
    private boolean passei;

    private double media;

    public double calculaMedia(){
        if (getPrimeiraNota()==10){
            setPrimeiraNota(2.5);
        }else if (getPrimeiraNota()>=7 && getPrimeiraNota()<10) {
            setPrimeiraNota(2.0);
        }else {
            setPrimeiraNota(1.0);
        }if (getSegundaNota()==10){
            setSegundaNota(2.5);
        } else if (getSegundaNota()>=7 && getSegundaNota()<10) {
            setSegundaNota(2.0);
        }else {
            setSegundaNota(1.0);
        }if (getNotaTrabalho()==10){
            setNotaTrabalho(5);
        } else if (getNotaTrabalho()>=7 && getSegundaNota()<10) {
            setNotaTrabalho(3);
        }else {
            setNotaTrabalho(2);
        }
        media = (getPrimeiraNota()+getSegundaNota()+getNotaTrabalho());
        return media;
    }
        public boolean aprovado(){
           if (getMedia()>=7){
              setPassei(true);
               System.out.println("Aprovado");
           }else {
               System.out.println("Reprovado");
           }
           return aprovado();
    }

    public boolean getPassei() {
        return passei;
    }

    public void setPassei(boolean passei) {
        this.passei = passei;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
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

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }


}
