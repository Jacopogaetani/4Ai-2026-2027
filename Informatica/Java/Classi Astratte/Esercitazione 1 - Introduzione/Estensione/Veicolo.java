public abstract class Veicolo {
    //Creo la classe astratta, funziona da modello
    protected String modello, marca;
    protected float velocitaMax;
    protected float accelerazione, vIniziale;

    //Creo un costruttore per poterlo richiamare nelle sottoclassi derivate
    public Veicolo(String modello, String marca, float velocitaMax,  float accelerazione, float vIniziale) {
        this.velocitaMax = velocitaMax;
        this.modello = modello;
        this.marca = marca;
        this.velocitaMax = velocitaMax;
        this.accelerazione = accelerazione;
        this.vIniziale = vIniziale;
    }

    //Ridefinisco il metodo toString
    @Override
    public String toString() {
        return "modello='" + modello + '\'' +
                ", marca='" + marca + '\'' +
                ", velocitaMax=" + velocitaMax;
    }

    //Metodo astratto, dovrà essere definito in OGNI sottoclasse.
    public abstract void movimento();

    //tempo in secondi

    public float calcolaVelocita(float tempo)
    {
        velocitaMax = vIniziale + (accelerazione * tempo);
        return velocitaMax;
    }

    public float formulaInversa()
    {
        float tempo;
        tempo = (velocitaMax - vIniziale)/accelerazione;
        return tempo;
    }

    public abstract void accensione();
    public abstract void spegnimento();



}
