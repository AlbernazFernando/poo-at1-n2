public class Saxofone extends EscolaMusica {
    private String tipo;

    public Saxofone(String nome, String material, String tipo){
        super(nome, material);
        this.tipo = tipo;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando jazz suave no  " + nome +" " + tipo + "...");
        System.out.println("Melodia envolvente de saxofone ");
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a embocadura e as chaves do saxofone.");
    }

    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("O tipo dele é " + tipo);
    }

    public String getTipo() { return tipo;}
}
