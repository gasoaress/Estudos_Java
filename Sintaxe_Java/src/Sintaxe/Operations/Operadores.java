package Sintaxe.Operations;
public class Operadores {
    public static void main(String[] args) throws Exception {
        int valor = 5;
        System.out.println(-valor); /* Printa -5 mas a variavel "valor" continua sendo positiva */

        System.out.println(valor); /* Comprova que continua positiva */


        valor = - valor;
        System.out.println(valor); /* "Valor" fica negativa */

        valor = valor * -1;
        System.out.println(valor); /* "Valor" fica positivo */
    }
}
