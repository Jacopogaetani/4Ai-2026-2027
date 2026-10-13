public class Programmatore extends Dipendente{
    public Programmatore(String nome, float stipendioBase) {
        super(nome, stipendioBase);
    }

    @Override
    public float calcolaStipendio() {
        return stipendioBase+200;
    }

    @Override
    public float calcolaPremio() {
        return 0;
    }
}
