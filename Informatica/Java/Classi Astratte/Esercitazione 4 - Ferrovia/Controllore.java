package Ferrovia;

public class Controllore extends Addetto{
    private String zonaServizio;
    private int treniDaControllare;
    private int treniControllati;

    public Controllore(String nome, String cognome, String codiceFiscale, String matricola, float pagaOraria, int oreLavorate, String zonaServizio, int treniDaControllare) {
        super(nome, cognome, codiceFiscale, matricola, pagaOraria, oreLavorate);
        this.zonaServizio = zonaServizio;
        this.treniDaControllare = treniDaControllare;
        this.treniControllati = 0;
    }

    public String getZonaServizio() {
        return zonaServizio;
    }

    public void setZonaServizio(String zonaServizio) {
        this.zonaServizio = zonaServizio;
    }

    public int getTreniDaControllare() {
        return treniDaControllare;
    }

    public void setTreniDaControllare(int treniDaControllare) {
        this.treniDaControllare = treniDaControllare;
    }

    @Override
    public String toString() {
        return "zonaServizio='" + zonaServizio + '\'' +
                ", treniDaControllare=" + treniDaControllare;
    }

    public void controllaTreno()
    {
        if(treniDaControllare > 0)
        {
            this.treniDaControllare--;
            this.treniControllati++;
        }
    }


    @Override
    public int calcolaPriorita() {
        if(treniDaControllare > 5)
        {
            return 3;
        }
        else if(treniDaControllare >= 2 && treniDaControllare <=4)
        {
            return 2;
        }
        else{
            return 1;
        }
    }
}
