import java.util.ArrayList;

public class ChatBot {
    private int idConversa;
    private ArrayList<String> perguntas;
    private ArrayList<String> respostas;

    public ChatBot(){
        System.out.println("\n==================== CHAT-BOT CRIADO ====================\n");
    }

    public void criaConexao(String apiKey, String url, String assistentId){
        System.out.println("Iniciando conexão.");
        System.out.println("Iniciando conexão..");
        System.out.println("Iniciando conexão...");
        System.out.println("Conexão estável");
    }

    public void perguntaResposta(){
        perguntas = new ArrayList<String>();
        respostas = new ArrayList<String>();
    }

    public String conversa(String pergunta){
        String resposta = "Desculpe ainda não consigo te entender -_-' ";
        perguntas.add(pergunta);
        respostas.add(resposta);
        return resposta;
    }

    public int getIdConversa() {
        return idConversa;
    }

    public void setIdConversa(int idConversa) {
        this.idConversa = idConversa;
    }

}
