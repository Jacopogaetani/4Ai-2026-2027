package Ripasso;

public class SquadraInternazionale extends Squadra{
    private String nazionalitaSquadra;
    int nazionalitaDifferenti;

    public SquadraInternazionale(String nome, String citta, String nomeAllenatore, String nazionalitaSquadra) {
        super(nome, citta, nomeAllenatore);
        this.nazionalitaSquadra = nazionalitaSquadra;
    }

    public void elencoStranieri()
    {
        if(giocatoriInSquadra > 0)
        {
            System.out.println("-------STRANIERI-------");
            for(int i = 0; i < giocatoriInSquadra; i++)
            {
               if(!(squadra[i].getNazionalita().equals(this.nazionalitaSquadra))) //Controlla che la nazionalità sia diversa
               {
                   System.out.println(squadra[i].getNome());
                   nazionalitaDifferenti++; //Aumenta il contatore, torna utile nel dare il numero di stranieri
               }
            }
        }
    }

    public int numeroStranieri()
    {
        return nazionalitaDifferenti;
    }

}
