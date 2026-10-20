public class Consulente extends Dipendente implements Premiabile{

    private double oreLavorate, tariffaOraria;

    public Consulente(String nome, String matricola, double oreLavorate, double tariffaOraria) {
        super(nome, matricola);
        this.oreLavorate = oreLavorate;
        this.tariffaOraria = tariffaOraria;
    }

    public double getOreLavorate() {
        return oreLavorate;
    }

    public void setOreLavorate(double oreLavorate) {
        this.oreLavorate = oreLavorate;
    }

    public double getTariffaOraria() {
        return tariffaOraria;
    }

    public void setTariffaOraria(double tariffaOraria) {
        this.tariffaOraria = tariffaOraria;
    }

    @Override
    public double calcolaStipendio() {
        return oreLavorate * tariffaOraria;
    }

    @Override
    public double calcolaPremio() {
        return this.calcolaStipendio() * 0.10;
    }

    @Override
    public String toString() {
        return "Consulente" +
                "oreLavorate=" + oreLavorate +
                ", tariffaOraria=" + tariffaOraria;
    }
}
