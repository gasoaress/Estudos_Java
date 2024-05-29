public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
    /* ABAIXO TEMOS O CONSTRUTOR, QUE TEM O MESMO NOME DA CLASSE */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    public Pessoa (){
    
    }
	public String getNome() {
		return nome;
	}
    public String getCpf() {
		return cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	//...
	//setters de nome e cpf ?
}
