package Exercicios;

public class Exercico4 {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();

        smartTV.ligar();
        smartTV.aumentarVolume();
        smartTV.subirCanal();

        System.out.println("ESta ligada a tv? "+ smartTV.ligado);
        System.out.println("Canal atual "+smartTV.canal);
        System.out.println("Volume da TV "+smartTV.volume);

        smartTV.mudarCanal(527);
        System.out.println("Novo Canal "+ smartTV.canal);
    }


}
