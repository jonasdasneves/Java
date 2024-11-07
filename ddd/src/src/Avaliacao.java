import java.util.Date;
import java.util.Scanner;

public class Avaliacao {
    private String comentario;
    private int nota;
    private String dataAvaliacao;

    public Avaliacao(String dataAvaliacao) {
        System.out.println("\n==================== AVALIAÇÃO CRIADA ====================\n");
        this.dataAvaliacao = dataAvaliacao;
    }

    public String deixarComentario(){
        Scanner input = new Scanner(System.in);
        System.out.println("\nDeixe seu comentário avaliando o serviço!\n");
        String comment = input.next();
        return comment;
    }

    public int deixarNota(){
        Scanner input = new Scanner(System.in);
        int star = 0;
        while(1>star || star>5) {
            System.out.println("\n deixe sua nota sobre o serviço, de 1 a 5! \n");
            star = input.nextInt();
        }
        return star;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(String dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }
}
