package app;
public class Telegram extends ServicoMensagemInstantanea {

    public void ReceberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Envio de mensagem pelo Telegram");
    }

    public void EnviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
        System.out.println("Envio de mensagem pelo Telegram");
    }
    public void salvarHistoricoMensagem(){
        
    }
}