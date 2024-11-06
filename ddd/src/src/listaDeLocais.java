import java.util.ArrayList;

public class listaDeLocais {
    private ArrayList<local> locais;

    public listaDeLocais(){
        locais = new ArrayList<local>();
    }

    public void adicionarLocal(local local){
        locais.add(local);
    }

}
