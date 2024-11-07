import java.util.ArrayList;

public class ListaDeLocais {
    private ArrayList<Local> locais;

    public ListaDeLocais(){
        locais = new ArrayList<Local>();
    }

    public void adicionarLocal(Local local){
        locais.add(local);
    }

}
