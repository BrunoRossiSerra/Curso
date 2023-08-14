package Exercicios;

public class SmartTV {
    boolean ligado;
    int canal =1;
    int volume =10;

    public void desligar(){
        ligado = false;
    }

    public void ligar(){
        ligado = true;
        System.out.println("A Tv Ligou");
    }
    public int mudarCanal(int canalNovo){
        return canal = canalNovo;
    }
    public void diminuirCanal(){
        if (ligado){
            canal++;
        }else{
            System.out.println("a tv não esta ligada");
        }
    }
    public void subirCanal(){
        if (ligado){
            canal++;
        }else{
            System.out.println("a tv não esta ligada");
        }
    }
    public void aumentarVolume(){
        if (ligado){
            volume++;
        }
    }
    public void diminuirVolume(){
        if (ligado && volume>0){
            volume --;
        }else {
            System.out.println("A tv esta n omudo");
        }

    }



}
