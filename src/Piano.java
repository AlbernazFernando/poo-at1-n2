public class Piano extends EscolaMusica {
    private int numeroTeclas;

    public Piano (String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar() {
        System.out.println("Soando uma bela melodia no " + nome + " com " + numeroTeclas + " teclas ");
        System.out.println("Executando uma sonata Classica");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensao das cordas internas do piano. ");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Quantidade de teclas: " + numeroTeclas);

    }

    public int getNumeroTeclas() {return numeroTeclas;}
}
