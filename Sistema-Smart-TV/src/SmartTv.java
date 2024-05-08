public class SmartTv {
    boolean ligada = false;
    int volume = 15, canal = 1;

    public void ligar (){
        ligada = true;
    }

    public void desligar (){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentado Volume ->" + volume);
    }

    public void diminuirVolume(){
        volume --;
        System.out.println("Diminuindo Volume ->" + volume);
    }

    public void mudarCanal(int canal){
        this.canal = canal;
        System.out.println("Canal ->" + this.canal);
    }

    public void avancarUmCanal () {
        canal ++;
        System.out.println("Acançando Canal ->" + canal);
    }

    public void voltarUmCanal () {
        canal --;
        System.out.println("Voltando Canal ->" + canal);
    }
}
