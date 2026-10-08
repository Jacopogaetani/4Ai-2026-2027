public class Moto extends Veicolo{

    public Moto(String modello, String marca, float velocitaMax, float accelerazione, float vIniziale) {
        super(modello, marca, velocitaMax, accelerazione, vIniziale);
    }

    @Override
    public void accensione() {
        System.out.println("La moto si accende con la chiave");
    }

    @Override
    public void spegnimento() {
        System.out.println("La moto si spegne con la chiave");
    }

    @Override
    public void movimento() {
        System.out.println("La moto " + modello + "" + marca + " sfreccia in pista a " + velocitaMax + "km/h");
    }
}
