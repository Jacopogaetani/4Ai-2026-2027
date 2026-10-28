public abstract class Pubblicazione {
    private String titolo;
    private int annoPubblicazione, giorniPrestito;

    public Pubblicazione(String titolo, int annoPubblicazione, int giorniPrestito) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.giorniPrestito = giorniPrestito;
    }

    public String getTitolo() {
        return titolo;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public int getGiorniPrestito() {
        return giorniPrestito;
    }

    public boolean setGiorniPrestito(int giorniPrestito) {
        if(giorniPrestito > 0) //viene fatto il controllo del maggiore di 0
        {
            this.giorniPrestito = giorniPrestito;
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isRecente()
    {
        if(annoPubblicazione >= 2025)
        {
            return true;
        }
        else{
            return false;
        }
    }

    public double calcolaCostoBase(double costoPagina, double costoGiorno, int pagine)
    {
        return costoGiorno + (pagine * costoPagina);
    }

    public abstract double calcolaCostoPrestito();

    @Override
    public String toString() {
        return "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", giorniPrestito=" + giorniPrestito;
    }
}
