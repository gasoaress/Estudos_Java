public class Autodromo {
    public static void main(String[] args) {
        Carro ferrari = new Carro();
        ferrari.Ligar();
        ferrari .setChassi("GA123BR45");

        Moto hornet = new Moto();
        hornet.setChassi("Will");
        
        Veiculo coringa = ferrari;
        System.out.println(coringa);
    }
}
