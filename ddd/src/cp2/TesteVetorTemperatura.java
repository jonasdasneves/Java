public class TesteVetorTemperatura {
    public static void main(String[] args) {
        VetorTemperatura amostra = new VetorTemperatura(7);
        amostra.definirTemperaturas();
        amostra.maiorTemperatura();
        amostra.definirTemperaturasNegativas();
        amostra.definirTemperaturamedia();
        amostra.imprimir();
        int diasPositivos = amostra.contaDiasPositivos();
        System.out.println("Foram registrados " +diasPositivos+ " dias com temperaturas positivas");
    }
}
