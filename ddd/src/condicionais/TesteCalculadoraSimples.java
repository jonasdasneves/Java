package condicionais;

public class TesteCalculadoraSimples {
    public static void main(String[] args) {
        CalculadoraSimples cs = new CalculadoraSimples();
        int op = cs.menu();
        double n1 = cs.entradaDados();
        double n2 = cs.entradaDados();
        double result = cs.controlador(n1,n2,op);
        cs.imprimir(result);
    }
}
