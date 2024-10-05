package aula4;

public class Calculo_IMC {

    //Atributos
    private float peso;
    private float altura;

    //Método operacional!!
    public Calculo_IMC(float peso, float altura){
        System.out.println("Calculo de IMC");
        this.peso = peso;
        this.altura = altura;
    }

    //getters e setters

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double calularIMC(){
        double massa = (peso/Math.pow(altura, 2));
        return massa;
    }

    public void mostrarDados(double massa){
        System.out.printf("Massa: %.2f", massa);

        if (massa < 18.5) {
            System.out.println(" Abaixo do Peso!");
        } else if (massa >= 18.5 && massa < 25) {
            System.out.println(" Peso ideal!");
        } else if (massa >= 25 && massa < 30) {
            System.out.println(" Um pouco acima do peso");
        } else if (massa >= 30 && massa < 35) {
            System.out.println(" Obesidade Grau I");
        } else if (massa >= 30 && massa < 35) {
            System.out.println(" Obesidade Grau II");
        }else {
            System.out.println(" Obesidade Grau III");
        }
    }
}
