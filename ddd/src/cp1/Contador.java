package cp1;

/*
Criar uma classe Contador que encapsule (guarde) um valor usado para uma
contagem de itens/elementos ou eventos. A classe deve conter:
◦ Um método Construtor para inicializar o contador;
◦ Um método para zerar o contador;
◦ Um método para incrementar o contador em uma unidade;
◦ Um método para decrementar o contador em uma unidade;
◦ Um método para retornar o valor atual do contador;
• O programa principal deve instanciar objetos da classe Contador e utilizar seus
m todos.
*/


public class Contador{
	
	//atributo da classe
	private int contador;
	
	//Construtor
	public Contador() {
		System.out.println("Contador inicializado!");
		contador = 0;
	}
	
	public void zerarContador() {
		System.out.println("Contador ZERADO!!!");
		contador = 0;
	}
	
	public void incrementarContador() {
		contador+=1;
	}
	
	public void decrementarContador() {
		contador-=1;
	}
	
	public int obterContador() {
		return contador; 
				
	}
	
	//----Teste----------------
	
	public static void main(String[] args) {
		
		Contador cont = new Contador();
		Contador cont2 = new Contador();
		
		System.out.println("Contador: " + cont.obterContador());
		cont.incrementarContador();
		cont.incrementarContador();
		cont.incrementarContador();
		System.out.println("Contador: " + cont.obterContador());
		cont.incrementarContador();
		cont.incrementarContador();
		cont.incrementarContador();
		cont.incrementarContador();
		cont.incrementarContador();
		cont.incrementarContador();
		System.out.println("Contador: " + cont.obterContador());
		cont.decrementarContador();
		System.out.println("Contador: " + cont.obterContador());
		cont.zerarContador();
		System.out.println("Contador: " + cont.obterContador());
		
		//---------off topic-------------------
		int i = 0;
		while(i<=10) {
			cont.incrementarContador();
			System.out.println("Contador: " + cont.obterContador());
			i+=1;
		}
		System.out.println("Contador: " + cont.obterContador());
		
		cont2.incrementarContador();
		cont2.incrementarContador();
		cont2.incrementarContador();
		System.out.println("Contador: " + cont2.obterContador());
	}
}
	
	
	
