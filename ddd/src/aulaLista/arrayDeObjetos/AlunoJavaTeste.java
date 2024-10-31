package aulaLista.arrayDeObjetos;

public class AlunoJavaTeste {
    public static void main(String[] args) {

        //Criar uma lista
        listaDeAlunos lista = new listaDeAlunos();

        AlunoJava a1 = new AlunoJava(1,"Junin");
        AlunoJava a2 = new AlunoJava(2,"Juvenal");

        lista.inserir(a1);
        lista.inserir(a2);
        lista.inserir(new AlunoJava(3,"Durval"));
    }
}
