public class Local {
    private String cidade;
    private String endereco;
    private String nome;

    public Local(String cidade, String endereco, String nome) {
        System.out.println("\n==================== LOCAL REGISTRADO ====================\n");
        this.cidade = cidade;
        this.endereco = endereco;
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
