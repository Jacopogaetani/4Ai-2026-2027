public abstract class Veicolo {
    //Creo la classe astratta, funziona da modello
    protected String modello, marca;
    protected int velocitaMax;

    //Creo un costruttore per poterlo richiamare nelle sottoclassi derivate
    public Veicolo(String modello, String marca, int velocitaMax) {
        this.modello = modello;
        this.marca = marca;
        this.velocitaMax = velocitaMax;
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
}
