public class Consulta_Impressora {

    public static void main(String[] args) {

        Impressora primeiro = Impressora.getlista("primeira impressão");
        Impressora segundo = Impressora.getlista("segunda impressão");
        Impressora terceiro = Impressora.getlista("terceira impressão");
        Impressora quarto = Impressora.getlista("quarto impressão");

        System.out.println(primeiro.imprime);
        System.out.println(segundo.imprime);
        System.out.println(terceiro.imprime);
        System.out.println(quarto.imprime);
    }
}