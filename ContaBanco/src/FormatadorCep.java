public class FormatadorCep {
    public static void main (String[] args) {
        try {
            String meuCep = formatarCep("37701053");   
            System.out.println(meuCep);
        } catch (Exception e) {
            System.out.println("CEP Inválido");
        }
    }
    /* Em throws CepInvalidoException eu determino que lança  */
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) 
            throw new CepInvalidoException(); /* Aqui determino a condição que vai lançar ou nao */
        
            //simula cep formatado
        return "23.765-064";
    }
}



