package app;
public class FacebookMessenger extends ServicoMensagemInstantanea {

    public void ReceberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebimento de mensagem pelo Facebook");
        
    }


    public void EnviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
        System.out.println("Envio de mensagem pelo Facebook");
    }
    public void salvarHistoricoMensagem(){

    }
}