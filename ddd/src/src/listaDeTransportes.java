import java.util.ArrayList;

public class listaDeTransportes {
    private ArrayList<transporte> transportes;

    public listaDeTransportes(){
        transportes = new ArrayList<transporte>();
    }

    public void adicionarTransporte(transporte meioTransporte){
        transportes.add(meioTransporte);
    }

}
