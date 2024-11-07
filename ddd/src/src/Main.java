import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        //Cria usuario e o adiciona à comunidade
        ListaDeUsuarios comunidade = new ListaDeUsuarios();
        comunidade.adicionarUsuario(new Usuario("Jonas Oliveira","00011122233","13/03/2004","jonascamp2004@gmail.com","11222224444"));
        Usuario usuarioLogado = comunidade.login("Jonas Oliveira");

        //Define transportes = o custo de transportes publicos é pela passagem, o de privado é por quilômetros
        ListaDeTransportes meiosTransporte = new ListaDeTransportes();
        meiosTransporte.adicionarTransporte(new Transporte("onibus-677Y",4.40,"coletivo"));
        meiosTransporte.adicionarTransporte(new Transporte("caminhada",0,"coletivo"));
        meiosTransporte.adicionarTransporte(new Transporte("moto",0.25,"privado"));
        meiosTransporte.adicionarTransporte(new Transporte("trem-linha-9esmeralda",4.40,"coletivo"));
        meiosTransporte.adicionarTransporte(new Transporte("carro",1.0,"privado"));

        //Cria chatBot novo e conversa com ele
        ChatBot totis = new ChatBot();
        totis.criaConexao("apiKey","URL","asssitentId");
        totis.perguntaResposta();
        String resposta = totis.conversa("O que você acha da revolução Russa?");
        System.out.println(resposta);

        //Adiciona locais a lista
        ListaDeLocais mapa = new ListaDeLocais();
        Local destino = new Local("São Paulo","av. Paulista, 1106","FIAP PAULISTA");
        Local partida = new Local("São Paulo","Av. Roque Petroni Júnior, 1089","Shopping Morumbi");
        Local parada1 = new Local("São Paulo","Av. Roque Petroni Júnior, 51","Estação Brooklin");
        Local parada2 = new Local("São Paulo","Av. Jabaquara, 2682","Santuário de São Judas Tadeu");

        //cria uma rota com destino e partida
        Rota caminho = new Rota(destino,partida);
        caminho.criaConexao("apiKey","URL");
        caminho.adicionarParada(parada1);
        caminho.adicionarParada(parada2);
        caminho.calcularRota();
        Double custoViagem = caminho.calcularCusto(new Transporte("carro",0.75,"privado"),53.0);
        System.out.printf("A viagem vai custar R$%2.2f",custoViagem);

        //anuncio
        Anuncio propaganda = new Anuncio(1,"Celular novo","Apple");
        propaganda.acaoAnuncio(usuarioLogado);
        System.out.printf("%d pessoas clicaram nesse anuncio",propaganda.getClick());

        //avaliacao
        Avaliacao aval = new Avaliacao("08/11/2024");
        String chat = aval.deixarComentario();
        int nota = aval.deixarNota();
        System.out.printf("Sua nota foi %d e seu comentário foi %s! Agradecemos seu feedback!",nota,chat);

    }
}
