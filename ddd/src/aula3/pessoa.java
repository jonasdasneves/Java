package ddd.src.aula3;

public class pessoa {
    private String nome;
    private int idade;
    private float altura;

    //Construtores
    //Construtor vazio
    public pessoa(){
        System.out.println("CONSTRUTOR DEFAULT");
    }

    //Construtor Cheio
    public pessoa(String nome, int idade, float altura) {
        System.out.println("CONSTRUTOR PARAMETRIZADO");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public pessoa(String nome) {
        System.out.println("CONSTRUTOR PARAMETRIZADO");
        this.nome = nome;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
}

