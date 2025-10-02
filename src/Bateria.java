public class Bateria extends EscolaMusica {
    private int numeroPecas;

    public Bateria (String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo na " + nome +"com " + numeroPecas + "peças");
        System.out.println("Bomm");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensao das peles dos tambores");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("numero de peças: " + numeroPecas);
    }

    public int getNumeroPecas() {return numeroPecas;}

}
