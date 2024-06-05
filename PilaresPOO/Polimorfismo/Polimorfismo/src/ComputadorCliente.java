import app.FacebookMessenger;
import app.MSNMessenger;
import app.ServicoMensagemInstantanea;
import app.Telegram;

public class ComputadorCliente {
	public static void main(String[] args) {
		
		ServicoMensagemInstantanea smi = null;
		
		/*
			NÃO SE SABE QUAL APP 
			MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM

			Polimorfismo permite que as classes mais abstratas, determinem ações uniformes, 
			para que cada classe filha concreta, implemente os comportamentos de forma específica.

			
		 */	
		String appEscolhido="???"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.EnviarMensagem();
		smi.ReceberMensagem();
	}
}