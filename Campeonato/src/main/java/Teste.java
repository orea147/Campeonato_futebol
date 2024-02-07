public class Teste {
    public static void main(String[] args) {
        Clube[] clubes = {
            new Clube("Palmeiras"),
            new Clube("Corinthians"),
            new Clube("São Paulo"),
            new Clube("Santos"),
            new Clube("Flamengo")
        };

        Campeonato camp = new Campeonato(clubes);
        camp.jogarCampeonato();

        System.out.println(camp.getClassificacao());
        System.out.println("\n");
        System.out.println(camp.getCampeao());
    }
}