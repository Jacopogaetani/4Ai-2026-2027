public abstract class Figura {
    protected float area;
    protected String identificatore;

    public Figura(String identificatore) {
        this.area = 0.0f;
        this.identificatore = identificatore;
    }

    public abstract float calcolaArea();
}
