package cursoPoojava.exercicio2;

public class Lampada {

    private boolean lampadaLiga;
    private boolean lampadaDesligada;
    private boolean conectada;
    private boolean temEnergia;

    private boolean queimada;
    public Lampada(){

    }
    public void testaLampada(){
        if (this.isConectada() && this.isTemEnergia()
            && this.isQueimada()!=true){
            System.out.println("Ligada");
            isLampadaLiga();
        }else {
            System.out.println("Desligada");

        }

    }

    public boolean isQueimada() {
        return queimada;
    }

    public void setQueimada(boolean queimada) {
        this.queimada = queimada;
    }

    public boolean isLampadaLiga() {
        return this.lampadaLiga;

    }

    public void setLampadaLiga(boolean lampadaLiga) {
        this.lampadaLiga = lampadaLiga;
    }

    public boolean isLampadaDesligada() {
        return lampadaDesligada;
    }

    public void setLampadaDesligada(boolean lampadaDesligada) {
        this.lampadaDesligada = lampadaDesligada;
    }

    public boolean isConectada() {
        return conectada;
    }

    public void setConectada(boolean conectada) {
        this.conectada = conectada;
    }

    public boolean isTemEnergia() {
        return temEnergia;
    }

    public void setTemEnergia(boolean temEnergia) {
        this.temEnergia = temEnergia;
    }
}
