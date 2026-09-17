package Ripasso;

public class Main {
    public static void main(String[] args)
    {
        //Creazione oggetti giocatori
        Giocatore g1 = new Giocatore("Mario", "Rossi", "attaccante", 13, "Italiana");
        Giocatore g2 = new Giocatore("Correa", "Rachel", "difensore", 9, "Filippina");
        Giocatore g3 = new Giocatore("Makoto", "Yuki", "attaccante", 10, "Giapponese");
        Giocatore g4 = new Giocatore("Ronnel", "Correa", "attaccante", 19, "Filippina");

        //Creazione squadre
        Squadra s1 = new Squadra("SEES", "Iwatodai", "Mitsuru");
        SquadraInternazionale i1 = new SquadraInternazionale("Filippine", "Valenzuela", "Caio", "Filippina");

        //Giocatori nelle squadre
        s1.aggiungiGiocatore(g1);
        s1.aggiungiGiocatore(g2);

        //Test metodi
        s1.descrizione();
        s1.nomiGiocatori();
        s1.giocatoriAttaccanti();

        i1.aggiungiGiocatore(g1);
        i1.aggiungiGiocatore(g2);

        i1.elencoStranieri();


    }
}
