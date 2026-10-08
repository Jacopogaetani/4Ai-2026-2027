public class Rettangolo extends Figura{
    protected float base, altezza;

    public Rettangolo(String identificatore, float base, float altezza) {
        super(identificatore);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float calcolaArea() {
        area = base * altezza;
        return area;
    }

    @Override
    public String toString() {
        return "Rettangolo\n" +
                "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                ", identificatore='" + identificatore + '\'';
    }
}
