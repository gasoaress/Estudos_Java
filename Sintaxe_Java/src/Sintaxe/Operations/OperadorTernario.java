package Sintaxe.Operations;

public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        int a, b;

        a = 5;
        b = 5;

        String resultado = a == b ? "verdadeiro" : "falso";
        int resultado2 = a == b ? 1 : 0;

        System.out.println("resultado string" + " " + resultado);
        System.out.println("resultado int" + " " + resultado2);

        /* O SEGUINTE BLOCO PODE SER SUBSTITUIDO PELO CODIGO ACIMA
         * if (a==b){
         * resultado = "verdadeiro";
         * } else {
         * resultado = "falso";
         * }
         */
    }
}
