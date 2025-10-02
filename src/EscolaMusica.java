public class EscolaMusica {

    public static void main(String[] args) {
        System.out.println("Iniciar a Orquestra");

        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao("Violao Classico", "madeira", 6);
        banda[1] = new Piano("Piano de cauda", "madeira", 88);
        banda[2] = new Bateria("Bateria Acustica", "madeira", 5);
        banda[3] = new Saxofone("Saxofone", "latao", "Alto");

        EscolaMusica em = new EscolaMusica();
        em.apresentar(banda);

    }

    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("Afinaçao");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
        }

        System.out.println("começar a tocar");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
        }

        for (int i = 0; i < banda.length; i++) {
            System.out.println("instrumento musical " + (i + 1) + ": ");
            banda[i].mostrarInformacoes();
            banda[i].tocar();
            System.out.println();
        }
    }

}