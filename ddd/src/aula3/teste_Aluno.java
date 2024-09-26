package ddd.src.aula3;

public class teste_Aluno {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(1,"Pedro", "ADS", true, 9.0f);
        System.out.println(a1.toString());

        Aluno a2 = new Aluno(2,"Junin");
        System.out.println(a2.toString());

        a2.calcularMedia(6,7,9);

        System.out.println(a2.toString());

    }
}
