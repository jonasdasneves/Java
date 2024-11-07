import java.util.ArrayList;

public class ListaDeTransportes {
    private ArrayList<Transporte> transportes;

    public ListaDeTransportes(){
        transportes = new ArrayList<Transporte>();
    }

    public void adicionarTransporte(Transporte meioTransporte){
        transportes.add(meioTransporte);
    }

}
