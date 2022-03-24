public class Impressora {
    private static Impressora fila;
    public String imprime;

    private Impressora(String imprime) {
        this.imprime = imprime;
    }

    public static Impressora getlista(String imprime) {
        if (fila == null) {
            fila = new Impressora(imprime);
        }
        return fila;
    }
}