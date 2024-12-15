package ExemploArrayList;

public class Contato {
	
	//atributos
	private String nome;
	private String telefone;
	private String endereco;
	
	//construtor com um parâmetro
	public Contato(String nome) {
		this.nome = nome;
	}
	
	//construtor parametrizado
	public Contato(String nome, String telefone, String endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Contato [nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + "]";
	}
}
