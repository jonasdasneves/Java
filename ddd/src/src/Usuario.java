import java.util.Calendar;
import java.util.Scanner;


public class Usuario {
    private String name;
    private String cpf;
    private String nascimento;
    private String email;
    private String celular;
    private boolean posicaoAutorizada;

    public Usuario(String name, String cpf, String nascimento, String email, String celular) {
        System.out.println("\n==================== USUÁRIO CRIADO ====================\n");
        this.name = name;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.celular = celular;
    }

    public boolean autorizarPosicao(boolean posicao){
        Scanner input = new Scanner(System.in);
        System.out.println("Você autoriza o Tótis saber sua posição em tempo real?\n (S)-sim \n (N)-não");
        if(posicao){
            System.out.println("Agradecemos a confiança!");
        }
        else{
            System.out.println("É uma pena!");
        }

        return posicao;
    }

    public void receberRota(Rota rota, String email, String celular){
        System.out.println("Um link para você seguir a rota traçada foi enviado ao seu email e WhatsApp!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isPosicaoAutorizada() {
        return posicaoAutorizada;
    }

    public void setPosicaoAutorizada(boolean posicaoAutorizada) {
        this.posicaoAutorizada = posicaoAutorizada;
    }
}
