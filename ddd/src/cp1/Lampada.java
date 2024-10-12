package cp1;

/*
 * Exerc cio L mpada
• Criar uma classe em Linguagem Java que represente uma Lâmpada, onde esta
pode ser ligada e desligada atrav s de m todos. Tamb m deve ser poss vel
observar o estado da l mpada, bem como alterar o seu estado (ligado/desligado).
Crie um m todo construtor para inicializar o estado da l mpada.
• O programa principal deve instanciar objetos da classe L mpada e utilizar seus
m todos.
 */

public class Lampada {
	
	//atributo
	private boolean estado;
	
	//Construtor
	public Lampada() {
		System.out.println("Objeto Lâmpada criado!");
		estado = false;
	}
	
	public void ligar() {
		estado = true;
	}
	
	public void desligar() {
		estado = false;
	}
	
	public boolean verificarEstado() {
		return estado;
	}
	
	public void mudarEstado() {
		if(estado == true) {
			estado = false;
		}else {
			estado = true;
		}
	}
	
	
	//-Teste----------------------
	
	public static void main(String[] args) {
		//criando o objeto lamp : Lampada
		Lampada lamp = new Lampada();
		
		System.out.println("Estado: " + 
		(lamp.verificarEstado() ? "LIGADO!" : "Desligado"));
		
		lamp.ligar();
		
		System.out.println("Estado: " + lamp.verificarEstado());
		lamp.desligar();
		System.out.println("Estado: " + lamp.verificarEstado());
		lamp.mudarEstado();
		System.out.println("Estado: " + lamp.verificarEstado());
		lamp.mudarEstado();
		System.out.println("Estado: " + lamp.verificarEstado());
	}	
	
	
	/*
	 * Operador ternário
	 * teste ? opção 1 : opção 2
	 * 
	 */
	
	
	
	
}