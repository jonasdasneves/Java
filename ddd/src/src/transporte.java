public class Transporte {
    private String transporte;
    private double custo;
    private String tipo;

    public Transporte(String Transporte,double custo,String tipo) {
        System.out.println("\n==================== TRANSPORTE REGISTRADO ====================\n");
        this.transporte = Transporte;
        this.custo = custo;
        this.tipo = tipo;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
