package Exercicios;

public class Exercico4 {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.mudarCanal();

        System.out.println("ESta ligada a tv? "+ smartTV.ligado);
        System.out.println("Canal atual "+smartTV.canal);
        System.out.println("Volume da TV "+smartTV.volume);

    }


}
