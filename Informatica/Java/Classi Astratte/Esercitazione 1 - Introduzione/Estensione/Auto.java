public class Auto extends Veicolo{

    public Auto(String modello, String marca, float velocitaMax, float accelerazione, float vIniziale) {
        super(modello, marca, velocitaMax, accelerazione, vIniziale);
    }

    @Override
    public void accensione() {
        System.out.println("La macchine si accende con la chiave");
    }

    @Override
    public void spegnimento() {
        System.out.println("La macchina si spegne con la chiave");
    }

    public void movimento()
    {
        System.out.println("L'auto " + modello + "" + marca + " sfreccia in pista aB " + velocitaMax + "km/h");
    }
}
