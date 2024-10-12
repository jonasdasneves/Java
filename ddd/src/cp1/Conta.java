package cp1;

/*
 
 Exercício Conta
• Criar uma classe Conta que contenha o nome do cliente, o número da conta e o
saldo. Estes valores dever o ser informados no construtor da classe;
• Criar o método construtor (parametrizado) para inicializar os atributos da classe
• Criar um método depositar e um método sacar para realizar o depósito e o saque
de valores da conta;
• Restrição: o cliente não poder realizar um saque, se não tiver saldo disponível.
O programa dever validar essa operação.
• Criar o método transferir, responsável por receber um valor de outro cliente.
• Criar métodos para acessar e modificar os atributos (getters e setters) para cada
atributo da classe.
• O programa principal deve instanciar objetos da classe Conta e utilizar seus
métodos.
 
 */


public class Conta {
	
	//atributos
	private String nome;
	private int conta;
	private double saldo;
	
	/**
	 * Construtor da Classe Conta
	 * @param nome
	 * @param conta
	 * @param saldo
	 */
	public Conta(String nome, int conta, double saldo) {
		System.out.println("*-* CONSTRUTOR *-*");
		System.out.println("Conta corrente criada!");
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the conta
	 */
	public int getConta() {
		return conta;
	}

	/**
	 * @param conta the conta to set
	 */
	public void setConta(int conta) {
		this.conta = conta;
	}

	/**
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	/*
	 * Métodos Operacionais
	 */
	
	public void depositar(double valor) {
		System.out.println("(*-* DEPOSITAR *-*");
		if(valor > 0) {
			this.saldo+= valor;
		}else {
			System.out.println("Não foi possível realizar um depósito negativo");
		}
	}
	
	public void sacar(double valor) {
		System.out.println("(*-* SACAR *-*");
		if(valor<= saldo) {
			saldo-=valor;
		}else {
			System.out.println("Saldo indisponível!");
		}
	}
	
	public void transferir(Conta contaDestino, double valor) {
		System.out.println("(*-* TRANSFERIR *-*");
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	//------Teste---------------------
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Patrícia", 123, 0);
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Conta: " + c1.getConta());
		System.out.println("Saldo: " + c1.getSaldo());
		c1.depositar(1000);
		System.out.println("Saldo: " + c1.getSaldo());
		
		Conta c2 = new Conta("Sara", 321, 500);
		System.out.println("Nome: " + c2.getNome());
		System.out.println("Conta: " + c2.getConta());
		System.out.println("Saldo: " + c2.getSaldo());
		
		c1.transferir(c2, 300);
		
		System.out.println("Saldo: " + c1.getSaldo());
		System.out.println("Saldo: " + c2.getSaldo());
	}
	
}























