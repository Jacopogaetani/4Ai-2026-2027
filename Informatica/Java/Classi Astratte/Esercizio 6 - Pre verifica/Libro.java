public class Libro extends Pubblicazione implements Prenotabile{
    private int numeroPagine;
    private boolean prenotato;

    public Libro(String titolo, int annoPubblicazione, int giorniPrestito, int numeroPagine, boolean prenotato) {
        super(titolo, annoPubblicazione, giorniPrestito);
        this.numeroPagine = numeroPagine;
        this.prenotato = prenotato;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public double calcolaCostoPrestito() {
         return (numeroPagine * 10) + (1*getGiorniPrestito());
    }

    public double calcolaPrezzoScontato()
    {
        return this.calcolaCostoPrestito() - (this.calcolaCostoPrestito() * 0.10);
    }

    //metodi prenotazione


    @Override
    public boolean prenota() {
        if(prenotato)
        {
            return false; //false se il libro è gia prenotato
        }
        else
        {
            return true;
        }
    }

    public String toString() {
        return "titolo='" + getTitolo() + '\'' +
                ", annoPubblicazione=" + getAnnoPubblicazione() +
                ", giorniPrestito=" + getGiorniPrestito() +
                ", numero di pagine=" + numeroPagine;

    }



}
