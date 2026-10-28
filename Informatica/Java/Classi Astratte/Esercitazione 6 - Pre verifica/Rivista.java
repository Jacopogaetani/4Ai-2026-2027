public class Rivista extends Pubblicazione{
    private String genereRivista;
    private int numeroPagine;

    public Rivista(int annoPubblicazione, String titolo, int giorniPrestito, String genereRivista, int numeroPagine) {
        super(annoPubblicazione, titolo, giorniPrestito);
        this.genereRivista = genereRivista;
        this.numeroPagine = numeroPagine;
    }

    public String getGenereRivista() {
        return genereRivista;
    }

    public void setGenereRivista(String genereRivista) {
        this.genereRivista = genereRivista;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }
    
    @Override
    public double calcolaCostoPrestito() {
        //Vari controlli in base al genere della rivista, viene usato il metodo equals
        if(this.genereRivista.equalsIgnoreCase("Giallo"))
        {
            return (0.50 * numeroPagine) + (1.50 * getGiorniPrestito());
        }else if (this.genereRivista.equalsIgnoreCase("Rosa")) {
            return (0.50 * numeroPagine) + (1.00 * getGiorniPrestito());
        }else if (this.genereRivista.equalsIgnoreCase("Scoop")) {
            return (1.00 * numeroPagine) + (1.50 * getGiorniPrestito());
        }else {
            return (0.10 * numeroPagine) + (2 * getGiorniPrestito());
        }
    }

    @Override
    public String toString() {
        return "titolo='" + getTitolo() + '\'' +
                ", anno di pubblicazione=" + getAnnoPubblicazione() +
                ", giorni di prestito=" + getGiorniPrestito() +
                ", genere della Rivista=" + genereRivista +
                ", numero di pagine=" + numeroPagine;
    }
}
