package Ripasso;

public class Main {
    public static void main(String[] args)
    {
        Giocatore g1 = new Giocatore("Mario", "Rossi", "attaccante", 13, "Italiana");
        Giocatore g2 = new Giocatore("Correa", "Rachel", "difensore", 9, "Filippina");
        Giocatore g3 = new Giocatore("Makoto", "Yuki", "attaccante", 10, "Giapponese");
        Giocatore g4 = new Giocatore("Ronnel", "Correa", "attaccante", 19, "Filippina");

        Squadra s1 = new Squadra("SEES", "Iwatodai", "Mitsuru");

        s1.aggiungiGiocatore(g1);
        s1.aggiungiGiocatore(g2);

        s1.descrizione();
        s1.nomiGiocatori();
        s1.giocatoriAttaccanti();


    }
}
