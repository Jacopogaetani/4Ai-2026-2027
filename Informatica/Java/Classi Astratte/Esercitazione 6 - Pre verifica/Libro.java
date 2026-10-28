public class Libro extends Pubblicazione implements Prenotabile{
    private int numeroPagine;
    private boolean isInPrestito; //true se il libro è attualmente in prestito --> Se è true non prestare ulteriormente nel metodo

    public Libro(int annoPubblicazione, String titolo, int giorniPrestito, int numeroPagine, boolean isInPrestito) {
        super(annoPubblicazione, titolo, giorniPrestito);
        this.numeroPagine = numeroPagine;
        this.isInPrestito = isInPrestito;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    public boolean isInPrestito() {
        return isInPrestito;
    }

    public void setInPrestito(boolean inPrestito) {
        isInPrestito = inPrestito;
    }

    @Override
    public double calcolaCostoPrestito() {
        return (0.10*numeroPagine) + (1*getGiorniPrestito());
        //usando il return posso dopo chiamare il metodo sull'oggetto che voglio per avere il valore di cui ho bisogno
    }

    public double calcolaPrezzoScontato()
    {
        return this.calcolaCostoPrestito() - (this.calcolaCostoPrestito() * 0.10); //ritorna il prezzo scontato del 10 percento
    }

    @Override
    public boolean prenota() {
        if(this.isInPrestito())
        {
            return false; //Non può essere prestato se è gia in prestito
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
                ", numero di pagine=" + numeroPagine;
    }
}
