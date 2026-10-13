public abstract class Dipendente implements Premio{
    protected String nome;
    protected float stipendioBase;

    public Dipendente(String nome, float stipendioBase) {
        this.nome = nome;
        this.stipendioBase = stipendioBase;
    }

    public abstract float calcolaStipendio();


    @Override
    public String toString() {
        return
                "nome='" + nome + '\'' +
                ", stipendioBase=" + stipendioBase;
    }
}
