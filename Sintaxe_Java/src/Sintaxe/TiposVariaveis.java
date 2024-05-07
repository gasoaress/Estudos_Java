package Sintaxe;
public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 1300.5;

        short numeroCurto = 1;
        int numeroNormal = 5000;

        System.out.println(salarioMinimo);
        System.out.println(numeroCurto);
        System.out.println(numeroNormal);

        /*
         * NÃO É POSSÍVEL FAZER A SEGUINTE OPERAÇAO POIS TEMOS UM SHORT RECEBENDO UM INT
         * short numeroCurto2 = numeroNormal;
         * PODE-SE FAZER O TYPE CAST PARA SOLUCIONAR
         * short numeroCurto2 = (short) numeroNormal
         */
    }
}
