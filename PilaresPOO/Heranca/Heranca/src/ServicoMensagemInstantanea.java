//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	/* NA HERANÇA TODOS HERDAVAM A MESMA MANEIRA DE ENVIO/RECEBIMENTO DE MENSAGEM
	 * COM ABSTRAÇÃO, CADA UM TRABALHA COM SUA MANEIRA ÚNICA DE ENVIO DE MENSAGENS
	 * METODOS ABSTRATOS SÃO IDENIFICADOS PELA PALAVRA RESERVADA "ABSTRACT" E POR NÃO TEM NADA EM SEU CORPO, TERMINANDO COM "();"
	 */
	public abstract void EnviarMensagem();
	public abstract void ReceberMensagem();
}