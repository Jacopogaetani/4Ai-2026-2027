package Ferrovia;

public class Passeggero extends Persona{
    private int numeroBiglietto;
    private String destazione;
    private boolean coincidenza;

    public int getNumeroBiglietto() {
        return numeroBiglietto;
    }

    public void setNumeroBiglietto(int numeroBiglietto) {
        this.numeroBiglietto = numeroBiglietto;
    }

    public String getDestazione() {
        return destazione;
    }

    public void setDestazione(String destazione) {
        this.destazione = destazione;
    }

    public boolean isCoincidenza() {
        return coincidenza;
    }

    @Override
    public String toString() {
        return  "numeroBiglietto=" + numeroBiglietto +
                ", destazione='" + destazione + '\'' +
                ", coincidenza=" + coincidenza;
    }

    public void setCoincidenza(boolean coincidenza) {
        this.coincidenza = coincidenza;
    }

    public Passeggero(String nome, String cognome, String codiceFiscale, int numeroBiglietto, String destazione, boolean coincidenza) {
        super(nome, cognome, codiceFiscale);
        this.numeroBiglietto = numeroBiglietto;
        this.destazione = destazione;
        this.coincidenza = coincidenza;
    }

    @Override
    public int calcolaPriorita() {
        if(coincidenza)
        {
            return 3;
        }
        else{
            return 1;
        }
    }

}
