package app;
public abstract class ServicoMensagemInstantanea {
	
	public abstract void EnviarMensagem();
	public abstract void ReceberMensagem();
	
	//mais um método que todos os filhos deverão implementar
	public abstract void salvarHistoricoMensagem();
	
	//somente os filhos conhecem este método
	/* PROTECTEC -> qualquer classe filha, de ServicoMensagemInstantanea pode desfrutar através de herança, esta funcionalidade. */
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}	
}