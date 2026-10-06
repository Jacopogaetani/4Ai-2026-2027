public class Auto extends Veicolo{
    public Auto(String modello, String marca, int velocitaMax) {
        super(modello, marca, velocitaMax);
    }

    public void movimento()
    {
        System.out.println("L'auto " + modello + "" + marca + " sfreccia in pista aB " + velocitaMax + "km/h");
    }
}
