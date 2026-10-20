public class Manager extends Dipendente implements  Premiabile{
    private double stipendioBase, bonus;

    public Manager(String nome, String matricola, double stipendioBase, double bonus) {
        super(nome, matricola);
        this.stipendioBase = stipendioBase;
        this.bonus = bonus;
    }

    public double getStipendioBase() {
        return stipendioBase;
    }

    public void setStipendioBase(double stipendioBase) {
        this.stipendioBase = stipendioBase;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double calcolaStipendio() {
        return stipendioBase + bonus;
    }

    @Override
    public double calcolaPremio() {
        return bonus;
    }
}
