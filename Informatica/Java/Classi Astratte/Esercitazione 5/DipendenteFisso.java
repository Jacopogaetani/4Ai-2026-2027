public class DipendenteFisso extends Dipendente{
    private double stipendioFisso;

    public DipendenteFisso(String nome, String matricola, double stipendioFisso) {
        super(nome, matricola);
        this.stipendioFisso = stipendioFisso;
    }

    public double getStipendioFisso() {
        return stipendioFisso;
    }

    public void setStipendioFisso(double stipendioFisso) {
        this.stipendioFisso = stipendioFisso;
    }

    @Override
    public double calcolaStipendio() {
        return stipendioFisso;
    }
}
