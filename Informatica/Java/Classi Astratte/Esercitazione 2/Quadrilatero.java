public class Quadrilatero extends Figura{
    protected int base, altezza;

    public Quadrilatero(String identificatore, int base, int altezza) {
        super(identificatore);
        this.base = base;
        this.altezza = altezza;
    }

    @Override
    public float calcolaArea() {
        this.area = base * altezza;
        return area;
    }

    @Override
    public String toString() {
        return "base=" + base +
                ", altezza=" + altezza +
                ", area=" + area +
                ", identificatore='" + identificatore + '\'';
    }
}
