package ddd;

public class teste_lapiseira {

    public static void main(String[] args) {

        //criando objeto da classe caneta
        lapiseira c1 = new lapiseira();
        System.out.println("Objeto: " + c1);
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: "+ c1.getPonta());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Tampada: "+ c1.getTampada());
        System.out.println("\n=========================================\n");

        //alterando as informações do objeto
        c1.setModelo("Bic");
        c1.setPonta(0.5f);
        c1.setCor("Azul");
        c1.setTampada(true);

        System.out.println("Objeto: " + c1);
        System.out.println("Modelo: " + c1.getModelo());
        System.out.println("Ponta: "+ c1.getPonta());
        System.out.println("Cor: " + c1.getCor());
        System.out.println("Tampada: "+ c1.getTampada());
        System.out.println("\n=========================================\n");

        //criando outro objeto da Classe Caneta
        lapiseira c2 = new lapiseira();
        c2.setModelo("mont blanc");
        c2.setPonta(0.7f);
        c2.setCor("Preta");
        c2.setTampada(false);

        System.out.println("Modelo: " + c2.getModelo());
        System.out.println("Ponta: "+ c2.getPonta());
        System.out.println("Cor: " + c2.getCor());
        System.out.println("Tampada: "+ c2.getTampada());
        System.out.println("\n=========================================\n");
    }
}