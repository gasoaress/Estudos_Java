package Sintaxe.Operations;

public class CompararObjetos {
    public static void main(String[] args) throws Exception {
        String nomeum = "Gabriel";
        String nomedois = "Gabriel";

        System.out.println(nomeum == nomedois); /* RETORNO == TRUE */

        nomedois = new String("Gabriel"); /* NOMEDOIS RECEBE UM NOVO OBJ */
        System.out.println(nomeum == nomedois);  /* RETORNO == FALSE */

        System.out.println(nomeum.equals(nomedois)); /* RETORNO == TRUE. COMPARA O SE CONTEÚDO DOS DOIS OBJ SAO IGUAIS */

    }
}
