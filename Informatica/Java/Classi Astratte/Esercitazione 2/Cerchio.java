public class Cerchio extends Figura{
    protected final float PI = 3.14f;
    protected float raggio;

    public Cerchio(String identificatore, float raggio) {
        super(identificatore);
        this.raggio = raggio;
    }

    @Override
    public float calcolaArea() {
        area = PI * (raggio * raggio);
        return area;
    }

    @Override
    public String toString() {
        return "Cerchio\n" +
                "PI=" + PI +
                ", raggio=" + raggio +
                ", identificatore='" + identificatore + '\'' +
                ", area=" + area;
    }
}
