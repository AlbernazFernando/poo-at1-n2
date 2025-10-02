public class Violao extends EscolaMusica {
    private int numeroCordas;

    public Violao(String nome, String material, int numeroCordas){
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando notas suave no " + nome + numeroCordas + " cordas..." );
        System.out.println("Dedilhando uma melodia romantica");
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das " + numeroCordas + "cordas.");
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Numero de cordas: " + numeroCordas);

    }
    public int getNumeroCordas() {return numeroCordas;}
}
