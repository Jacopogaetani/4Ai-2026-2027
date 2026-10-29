public abstract class Pubblicazione {
    private String titolo;
    private int annoPubblicazione, giorniPrestito, numeroPagine;

    public Pubblicazione(int annoPubblicazione, String titolo, int giorniPrestito, int numeroPagine) {
        this.annoPubblicazione = annoPubblicazione;
        this.titolo = titolo;
        this.giorniPrestito = giorniPrestito;
        this.numeroPagine = numeroPagine;
    }

    public int getNumeroPagine()
    {
        return numeroPagine;
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
        if (giorniPrestito > 0) //Controlla che il dato inserito sia maggiore di 0
        {
            this.giorniPrestito = giorniPrestito;
            return true; //Uso una booleana per poter "giocare" con le stampe nel main e non pasticciare nel metodo
        } else {
            return false;
        }
    }

    public boolean isRecente() {
        if (this.annoPubblicazione >= 2025) //Uso un int per poter verificare che sia anche più recente del 2026... ci sarebbero certamente tecniche migliori
        {
            return true;
        } //aggiungere stampa in main
        else {
            return false;
        }
    }

    public double calcolaCostoBase(double costoPagina, double costoGiorno, int pagine) {
        //da rivedere l'implementazione con l'attributo delle altre classi (tipo libro)
        return (costoPagina * pagine) + (giorniPrestito * costoGiorno);
    }

    //metodo astratto da dover ridefinire sempre
    public abstract double calcolaCostoPrestito();

    //verrà ridefinito in ogni classe che estende pubblicazione
    @Override
    public String toString() {
        return "titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", giorniPrestito=" + giorniPrestito +
                '}';
    }
}
