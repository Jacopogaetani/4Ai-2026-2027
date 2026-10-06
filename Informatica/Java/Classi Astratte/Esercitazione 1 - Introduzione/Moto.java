public class Moto extends Veicolo{
    public Moto(String modello, String marca, int velocitaMax) {
        super(modello, marca, velocitaMax);
    }

    @Override
    public void movimento() {
        System.out.println("La moto " + modello + "" + marca + " sfreccia in pista a " + velocitaMax + "km/h");
    }
}
