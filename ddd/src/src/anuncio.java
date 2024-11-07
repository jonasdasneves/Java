import java.util.Scanner;

public class Anuncio {
    private int idAnuncio;
    private String produtoAnuncio;
    private String empresaAnuncio;
    private int click = 0;

    public Anuncio(int idAnuncio, String produtoAnuncio, String empresaAnuncio) {
        System.out.println("\n==================== ANUNCIO CRIADO ====================\n");
        this.idAnuncio = idAnuncio;
        this.produtoAnuncio = produtoAnuncio;
        this.empresaAnuncio = empresaAnuncio;
    }

    public boolean acaoAnuncio(Usuario usuario){
        Scanner input = new Scanner(System.in);
        int acao = 0;
        boolean clicar = false;
        System.out.printf("\nFoi exibido um anuncio de %s\n",produtoAnuncio);
        System.out.println("\n1-Ignorar;\n2-clicar;\n3-fechar\n");
        acao = input.nextInt();
        if(acao == 2){
            clicar = true;
            click = click+1;
        }
        else{
            clicar = false;
        }
        return clicar;
    }

    public int getIdAnuncio() {
        return idAnuncio;
    }

    public void setIdAnuncio(int idAnuncio) {
        this.idAnuncio = idAnuncio;
    }

    public String getProdutoAnuncio() {
        return produtoAnuncio;
    }

    public void setProdutoAnuncio(String produtoAnuncio) {
        this.produtoAnuncio = produtoAnuncio;
    }

    public String getEmpresaAnuncio() {
        return empresaAnuncio;
    }

    public void setEmpresaAnuncio(String empresaAnuncio) {
        this.empresaAnuncio = empresaAnuncio;
    }

    public int getClick() {
        return click;
    }

    public void setClick(int click) {
        this.click = click;
    }
}
