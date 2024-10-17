package ddd.src.alura.Poo;

public class Princial {

    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDelançamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDelançamento);
    }
}