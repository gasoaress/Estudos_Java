public class Carro extends Veiculo{
    
    public void Ligar () {
        System.out.println("Carro ligado");
        ConfereCambio();
        ConfereCombustivel();
    }
    private void ConfereCombustivel() {
        System.out.println("Confere combustivel");
    }
    private void ConfereCambio() {
        System.out.println("Confere cambio");
    }

} 
