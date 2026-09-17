package Ripasso;

public class SquadraInternazionale extends Squadra{
    private int nazionalitaSquadra;
    int nazionalitaDifferenti;

    public SquadraInternazionale(String nome, String citta, String nomeAllenatore, int nazionalitaSquadra) {
        super(nome, citta, nomeAllenatore);
        this.nazionalitaSquadra = nazionalitaSquadra;
    }

    public elencoStranieri()
    {
        if(giocatoriInSquadra > 0)
        {
            System.out.println("-------STRANIERI-------");
            for(int i = 0; i < giocatoriInSquadra; i++)
            {
                System.out.println(squadra[i].getNome());
            }
        }
    }

}
