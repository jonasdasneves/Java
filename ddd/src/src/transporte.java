public class transporte {
    private String Transporte;
    private double custo;
    private String tipo;

    public transporte(String Transporte,double custo,String tipo) {
        System.out.println("\n==================== TRANSPORTE REGISTRADO ====================\n");
        this.Transporte = Transporte;
        this.custo = custo;
        this.tipo = tipo;
    }

    public String getTransporte() {
        return Transporte;
    }

    public void setTransporte(String transporte) {
        Transporte = transporte;
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
