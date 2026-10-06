public class Bicicletta extends Veicolo{
    public Bicicletta(String modello, String marca, int velocitaMax) {
        super(modello, marca, velocitaMax);
    }

    @Override
    public void movimento() {
        System.out.println("La bici " + modello + "" + marca + " percorre la ciclabile a " + velocitaMax + "km/h");
    }
}
