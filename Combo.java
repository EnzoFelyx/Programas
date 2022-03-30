public class Combo {

    private Prato_Principal rango = new Prato_Principal();
    private Bebida beber = new Bebida();
    private Sobremesa doce = new Sobremesa();

    public void mostra_Domingao() {

        System.out.println("Combo de Domigão");
        rango.SelecionarPrato(1);
        beber.SelecionarBebida(3);
        doce.SelecionarSobremesa(2);
    }

    public void mostra_light() {

        System.out.println("\nCombo light");
        rango.SelecionarPrato(2);
        beber.SelecionarBebida(1);
        doce.SelecionarSobremesa(1);
    }

    public void mostra_classico() {

        System.out.println("\nCombo Classico");
        rango.SelecionarPrato(3);
        beber.SelecionarBebida(2);
        doce.SelecionarSobremesa(2);
    }

}
