package Ripasso;

public class Squadra {
    private String nome, citta, nomeAllenatore;
    final int MASSIMOGIOCATORI = 11;
    int giocatoriInSquadra = 0;

    //Elenco giocatori
    Giocatore squadra[] = new Giocatore[MASSIMOGIOCATORI];

    public Squadra(String nome, String citta, String nomeAllenatore) {
        this.nome = nome;
        this.citta = citta;
        this.nomeAllenatore = nomeAllenatore;
    }

    public String getNome() {
        return nome;
    }

    public String getCitta() {
        return citta;
    }

    public String getNomeAllenatore() {
        return nomeAllenatore;
    }

    public int getGiocatoriInSquadra() {
        return giocatoriInSquadra;
    }

    public void aggiungiGiocatore(Giocatore g)
    {
        if(giocatoriInSquadra < MASSIMOGIOCATORI)
        {
            squadra[giocatoriInSquadra] = g;
            giocatoriInSquadra++;
        }
    }

    public void descrizione()
    {
        System.out.println("-------DESCRIZIONE-------\n Nome squadra: " + nome + " della città " + citta);
    }

    public void nomiGiocatori()
    {
        if(giocatoriInSquadra > 0)
        {
            System.out.println("-------SQUADRA-------");
            for(int i = 0; i < giocatoriInSquadra; i++)
            {
                System.out.println(squadra[i].getNome());
            }
        }
    }

    public void giocatoriAttaccanti() {
        if (giocatoriInSquadra > 0) {
            System.out.println("-------ATTACCANTI-------");
            for (int i = 0; i < giocatoriInSquadra; i++) {
                if (squadra[i].getRuolo() == "Attaccante" || squadra[i].getRuolo() == "attaccante") {
                    System.out.println(squadra[i].getNome());
                }
            }
        }
    }

    public int giocatoriPresenti()
    {
        return giocatoriInSquadra;
    }

}
