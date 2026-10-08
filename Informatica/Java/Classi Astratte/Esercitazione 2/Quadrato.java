public class Quadrato extends Figura{
    protected float lato;

    public Quadrato(String identificatore, float lato) {
        super(identificatore);
        this.lato = lato;
    }

    @Override
    public float calcolaArea() {
        this.area = lato * lato;
        return area;
    }

    @Override
    public String toString() {
        return "Quadrato \n" +
                "lato=" + lato +
                ", area=" + area +
                ", identificatore='" + identificatore + '\'';
    }
}
