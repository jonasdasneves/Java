package ExemploArrayList;

import java.util.ArrayList;
import java.util.List;


public class Agenda {
	
	//declaração da lista
	private List<Contato> contatos;
	
	//construtor
	public Agenda() {
		//criando a lista
		contatos = new ArrayList<Contato>();
	}
	
	//inserir
	public void adicionar(Contato contato) {
		contatos.add(contato);
		System.out.println("Contato adicionado!");
	}
	
	//atualizar
	public void atualizar(int indice, Contato contato) {
		//validando o índice
		if(indice >= 0 && indice <contatos.size()) {
			contatos.set(indice, contato);
			System.out.printf("Contato %s foi atualizado!", contato.getNome());
		}
	}
	
	//remover
	public void remover(int indice) {
		if(indice >= 0 && indice< contatos.size()) {
			contatos.remove(indice);
			System.out.println("Contato removido!");
		}
	}
	
	//listar
	public void listar() {
		//for each (Java) -> for in (Python)
		for (Contato contato : contatos) {
			contato.toString();
			
			//ou
			System.out.println("--------------------------------");
			
			System.out.println(
					"Nome: " + contato.getNome() + "\n"
					+ "Telefone: " + contato.getTelefone() + "\n"
					+ "Endereço: " + contato.getEndereco() + "\n"
					);
		}
	}
	
	
	//perquisar por um nome
	public List<Contato> pesquisarNome(String nome){
		//criando uma lista que será retornada com os Contatos encontrados
		List<Contato> lista = new ArrayList<Contato>();
		
		for (Contato contato : contatos) {
			if(contato.getNome().equalsIgnoreCase(nome)) {
				//adicionar na lista
				lista.add(contato);
			}
		}
		return lista;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}