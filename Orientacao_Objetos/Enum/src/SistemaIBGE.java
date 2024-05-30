public class SistemaIBGE {
    public static void main(String[] args) throws Exception {
        /* Printa Estados */
        for (EstadoBrasileiro estados: EstadoBrasileiro.values()){
            System.out.println(estados.getSigla() + " - " + estados.getNome());
        }
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;
        EstadoBrasileiro teste = EstadoBrasileiro.SAO_PAULO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
        System.out.println(eb.getCodigoIBGE());
        System.out.println(eb.getNomeMaiusculo());


    }
}
