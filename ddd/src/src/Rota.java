import java.util.ArrayList;
import java.util.Date;

public class Rota {
    private double tempoRota;
    private Date dataRota;
    private ArrayList<Transporte> meiosTransporte;
    private Local destino;
    private Local partida;
    private ArrayList<Local> paradas;

    public Rota(Local destino, Local partida) {
        System.out.println("\n==================== ROTA CRIADA ====================\n");
        this.destino = destino;
        this.partida = partida;
        paradas = new ArrayList<Local>();
    }

    public void adicionarParada(Local localParada){
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

    public double calcularCusto(Transporte transporte,double distancia){
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

    public ArrayList<Transporte> getMeiosTransporte() {
        return meiosTransporte;
    }

    public void setMeiosTransporte(ArrayList<Transporte> meiosTransporte) {
        this.meiosTransporte = meiosTransporte;
    }

    public Local getDestino() {
        return destino;
    }

    public void setDestino(Local destino) {
        this.destino = destino;
    }

    public Local getPartida() {
        return partida;
    }

    public void setPartida(Local partida) {
        this.partida = partida;
    }

}
