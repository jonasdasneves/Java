import java.util.ArrayList;
import java.util.Date;

public class rota {
    private double tempoRota;
    private Date dataRota;
    private ArrayList<transporte> meiosTransporte;
    private local destino;
    private local partida;
    private ArrayList<local> paradas;

    public rota(local destino, local partida) {
        System.out.println("\n==================== ROTA CRIADA ====================\n");
        this.destino = destino;
        this.partida = partida;
        paradas = new ArrayList<local>();
    }

    public void adicionarParada(local localParada){
        paradas.add(localParada);
    }

    public void criaConexao(String apiKey, String url){
        System.out.println("Iniciando conexão.");
        System.out.println("Iniciando conexão..");
        System.out.println("Iniciando conexão...");
        System.out.println("Conexão estável");
    }

    public void calcularRota(){
        System.out.printf("Perfeito! Traçamos a melhor rota para o destino %s, saindo de %s",partida.getEndereco(),destino.getEndereco());

    }

    public double calcularCusto(transporte transporte,double distancia){
        double custoTransporte;
        if (transporte.getTipo().equals("coletivo")){
            custoTransporte = transporte.getCusto();
        }
        else{
            custoTransporte = (transporte.getCusto()*distancia);
        }
        return custoTransporte;
    }

    public double getTempoRota() {
        return tempoRota;
    }

    public void setTempoRota(double tempoRota) {
        this.tempoRota = tempoRota;
    }

    public Date getDataRota() {
        return dataRota;
    }

    public void setDataRota(Date dataRota) {
        this.dataRota = dataRota;
    }

    public ArrayList<transporte> getMeiosTransporte() {
        return meiosTransporte;
    }

    public void setMeiosTransporte(ArrayList<transporte> meiosTransporte) {
        this.meiosTransporte = meiosTransporte;
    }

    public local getDestino() {
        return destino;
    }

    public void setDestino(local destino) {
        this.destino = destino;
    }

    public local getPartida() {
        return partida;
    }

    public void setPartida(local partida) {
        this.partida = partida;
    }

}
