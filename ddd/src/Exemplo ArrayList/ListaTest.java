package aula17_ArrayList.exemplo5;

import java.util.Scanner;

public class ListaTest {
	
	public static void main(String[] args) {
		
		//criando uma agenda
		Agenda agenda = new Agenda();
		
		//criando contatos
		Contato c1 = new Contato("Jonas");
		c1.setTelefone("1234-4321");
		
		Contato c2 = new Contato("Davi", "1234-5678", "Rua XPTO, 123");
		Contato c3 = new Contato("Yasmin", "6543-1234", "Rua das Flores, 432");
		
		agenda.adicionar(c1);
		agenda.adicionar(c2);
		agenda.adicionar(c3);
		
		//listagem inicial
		System.out.println(">> Primeira listagem: ");
		agenda.listar();
		System.out.println("----------------------------\n");
		
		//atualizar
		System.out.println(">> Atualizar o primeiro contato: ");
		agenda.atualizar(0, new Contato("Jonas", "1234-4321", "FIAP"));
		
		//Segunda listagem
		System.out.println("----------------------------\n");
		System.out.println(">> Segunda listagem: ");
		agenda.listar();
		
		
		//adicionando contatos automaticamente
		for(int i=0; i<=5; i++) {
			
			Contato contato = new Contato("Nome " + i, 
					"Telefone " + i, 
					"Endereço" + i);
			agenda.adicionar(contato);
		}
		
		agenda.listar();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Nome: ");
		String nome = input.next();
		System.out.println(agenda.pesquisarNome(nome));
				
		
	}
	
}
