package alura.br.com.alura.screenmatch.modelos;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setAnoDelançamento(1988);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        System.out.println(meuFilme.pegaMedia());
    }
}
