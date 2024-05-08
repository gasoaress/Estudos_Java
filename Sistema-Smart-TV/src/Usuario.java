public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv samsung = new SmartTv();
        System.out.println("TV ligada? " + samsung.ligada);
        System.out.println("Qual o canal atual? " + samsung.canal);
        System.out.println("Qual o volume atual? " + samsung.volume);

        samsung.ligar();
        System.out.println("\nStatus -> TV ligada? " + samsung.ligada);

        samsung.desligar();
        System.out.println("Status -> TV ligada? " + samsung.ligada);

        samsung.aumentarVolume();
        samsung.aumentarVolume();
        samsung.aumentarVolume();
        
        samsung.diminuirVolume();

        samsung.avancarUmCanal();
        samsung.voltarUmCanal();

        samsung.mudarCanal(50);
    }
}
