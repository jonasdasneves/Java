import java.util.ArrayList;

public class listaDeUsuarios {
    private ArrayList<usuario> usuarios;

    public listaDeUsuarios(){
        usuarios = new ArrayList<usuario>();
    }

    public void adicionarUsuario(usuario cliente){
        usuarios.add(cliente);
    }

    public void atualizar(int indice, usuario cliente) {
        //validando o índice
        if(indice >= 0 && indice <usuarios.size()) {
            usuarios.set(indice, cliente);
            System.out.printf("Contato %s foi atualizado!", cliente.getName());
        }
    }

    public usuario login(String nome){
        usuario usuarioLogado = null;
        for(usuario user: usuarios){
            if(user.getName().equals(nome)){
                usuarioLogado = user;
                System.out.println(user.getName()+"Está logado! ");
            }
        }
        return usuarioLogado;
    }

}
