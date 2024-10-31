package aulaLista.arrayDeObjetos;

import java.util.ArrayList;

public class listaDeAlunos {

    private ArrayList<AlunoJava> alunos; //atributo da Classe

    public listaDeAlunos(){
        //instanciar a lista
        alunos = new ArrayList<AlunoJava>();
    }

    //insert (memória)
    public void inserir(AlunoJava aluno){
        alunos.add(aluno);
    }

    //select (memória)
    public void listar(){
        for(AlunoJava aluno : alunos){
            System.out.println("Aluno: "+aluno);
        }
    }
}
