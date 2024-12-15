package aula3;

public class teste_pessoa {
    public teste_pessoa() {
    }

    public static void main(String[] args) {

        //criando um objeto da classe pessoa
        pessoa p1 = new pessoa("Jonas");
        System.out.println("Pessoa: "+p1);
        System.out.println("Nome "+p1.getNome());
        System.out.println("Altura "+p1.getAltura());
        System.out.println("Idade "+p1.getIdade());
        System.out.println("=========================================================");

        //configurando os atributos da pessoa p1
        p1.setNome("Tiago");
        p1.setIdade(30);
        p1.setAltura(1.7f);

        System.out.println("Nome "+p1.getNome());
        System.out.println("Altura "+p1.getAltura());
        System.out.println("Idade "+p1.getIdade());

        //Criando um objeto dda classe p2 usando o construtor parametrizado/cheio
        pessoa p2 = new pessoa("Jonas", 30, 1.85f);
        System.out.println("Nome "+p2.getNome());
        System.out.println("Altura "+p2.getAltura());
        System.out.println("Idade "+p2.getIdade());
        System.out.println("=========================================================");

        pessoa p3 = new pessoa("Maria");
        System.out.println("Nome "+p3.getNome());

    }
}
