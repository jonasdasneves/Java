import java.util.ArrayList;

public class ListaDeUsuarios {
    private ArrayList<Usuario> usuarios;

    public ListaDeUsuarios(){
        usuarios = new ArrayList<Usuario>();
    }

    public void adicionarUsuario(Usuario cliente){
        usuarios.add(cliente);
    }

    public void atualizar(int indice, Usuario cliente) {
        //validando o índice
        if(indice >= 0 && indice <usuarios.size()) {
            usuarios.set(indice, cliente);
            System.out.printf("Contato %s foi atualizado!", cliente.getName());
        }
    }

    public Usuario login(String nome){
        Usuario usuarioLogado = null;
        for(Usuario user: usuarios){
            if(user.getName().equals(nome)){
                usuarioLogado = user;
                System.out.println(user.getName()+"Está logado! ");
            }
        }
        return usuarioLogado;
    }

}
