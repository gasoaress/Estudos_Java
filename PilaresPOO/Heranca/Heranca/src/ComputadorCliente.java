public class ComputadorCliente {
	public static void main(String[] args) {
		
		MSNMessenger msn = new MSNMessenger();
		msn.EnviarMensagem();
		msn.ReceberMensagem();
		
		FacebookMessenger fbm = new FacebookMessenger();
		fbm.EnviarMensagem();
		fbm.ReceberMensagem();
		
		Telegram tlg = new Telegram();
		tlg.EnviarMensagem();
		tlg.ReceberMensagem();
		
	}
}