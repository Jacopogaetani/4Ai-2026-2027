public class Bicicletta extends Veicolo{
    public Bicicletta(String modello, String marca, float velocitaMax, float accelerazione, float vIniziale) {
        super(modello, marca, velocitaMax, accelerazione, vIniziale);
    }

    @Override
    public void movimento() {
        System.out.println("La bici " + modello + "" + marca + " percorre la ciclabile a " + velocitaMax + "km/h");
    }

    @Override
    public void accensione() {
        System.out.println("La bici parte pedalando");
    }

    @Override
    public void spegnimento() {
        System.out.println("La bici si ferma smettendo di pedalare");
    }
}
