package app;
public class MSNMessenger extends ServicoMensagemInstantanea{

    public void ReceberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebimento de mensagem pelo MSN");
    }

    public void EnviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
        System.out.println("Envio de mensagem pelo MSN");
    }
    public void salvarHistoricoMensagem(){
        
    }
}