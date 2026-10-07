public class Coniche extends Figura{
    protected float circonferenza, raggio, diametro;
    protected final float PI = 3.14f;

    public Coniche(String identificatore, float circonferenza, float raggio, float diametro) {
        super(identificatore);
        this.circonferenza = circonferenza;
        this.raggio = raggio;
        this.diametro = diametro;
    }

    @Override
    public float calcolaArea() {
        this.area = PI * (raggio * raggio);
        return area;
    }

    @Override
    public String toString() {
        return
                "circonferenza=" + circonferenza +
                ", raggio=" + raggio +
                ", diametro=" + diametro +
                ", PI=" + PI +
                ", identificatore='" + identificatore + '\'' +
                ", area=" + area;
    }
}
