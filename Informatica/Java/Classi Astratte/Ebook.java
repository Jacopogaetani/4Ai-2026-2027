public class Ebook extends Pubblicazione implements Prenotabile{
    private int numeroPagine, pagineLette = 0;
    private boolean isInPrestito;

    public Ebook(int annoPubblicazione, String titolo, int giorniPrestito, int numeroPagine, int pagineLette, boolean isInPrestito) {
        super(annoPubblicazione, titolo, giorniPrestito);
        this.numeroPagine = numeroPagine;
        this.pagineLette = pagineLette;
        this.isInPrestito = isInPrestito;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public int getPagineLette() {
        return pagineLette;
    }

    public void setPagineLette(int pagineLette) {
        this.pagineLette = pagineLette;
    }

    public boolean isInPrestito() {
        return isInPrestito;
    }

    public void setInPrestito(boolean inPrestito) {
        isInPrestito = inPrestito;
    }

    @Override
    public double calcolaCostoPrestito() {
        return (0.05 * numeroPagine) + (0.50 * getGiorniPrestito());
    }

    public boolean leggiPagine(int pagine)
    {
        if(pagineLette + pagine <= numeroPagine)
        {
            pagineLette+=pagine;
            return true;
        }
        else{
            return false;
        }
    }

    public double getPercentualeLetta()
    {
        return ((double)pagineLette / (double)getNumeroPagine()) * 100;
    }

    @Override
    public boolean prenota() {
        if(isInPrestito)
        {
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public String toString() {
        return "titolo='" + getTitolo() + '\'' +
                ", anno di pubblicazione=" + getAnnoPubblicazione() +
                ", giorni di prestito=" + getGiorniPrestito() +
                ", pagine lette=" + pagineLette +
                ", pagine totali=" + numeroPagine;
    }
}
