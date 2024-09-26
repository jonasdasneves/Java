package ddd.src.aula3;

public class Aluno {
    //atributos
    private int matricula;
    private String nome;
    private String curso;
    private boolean status;
    private float mediaGeral;

    //Construtor vazio
    public Aluno(){
        System.out.println("Objeto Aluno Criado!");
    }

    //Construtor cheio
    public Aluno(int matricula, String nome){

        System.out.println("Objeto Aluno Criado!");
        this.matricula = matricula;
        this.nome = nome;
    }

    //Construtor cheio
    public Aluno(int matricula, String nome, String curso, boolean status, float mediaGeral) {

        System.out.println("Objeto Aluno Criado!");
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.status = status;
        this.mediaGeral = mediaGeral;
    }

    //Getters e Setters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getCurso() {
        return curso;
    }

    public boolean isStatus() {
        return status;
    }

    public float getMediaGeral() {
        return mediaGeral;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    //metodo operacional
    public void calcularMedia(float n1, float n2, float n3) {
        this.mediaGeral = (n1+n2+n3)/3;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", status=" + status +
                ", mediaGeral=" + mediaGeral +
                '}';
    }

}
