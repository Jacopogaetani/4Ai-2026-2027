public class Manager extends Dipendente{
    public Manager(String nome, float stipendioBase) {
        super(nome, stipendioBase);
    }

    @Override
    public float calcolaStipendio() {
        return stipendioBase+500;
    }

    @Override
    public float calcolaPremio() {
        return 0.10f*stipendioBase;
    }
}
