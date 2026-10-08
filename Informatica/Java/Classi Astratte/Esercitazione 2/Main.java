public class Main {
    public static void main(String[] args)
    {
        Quadrato q1 = new Quadrato("Quadrato 1 ", 10);
        Rettangolo r1 = new Rettangolo("Rettangolo 1", 5, 3);
        Cerchio c1 = new Cerchio("Cerchio 1", 6);

        q1.calcolaArea();
        r1.calcolaArea();
        c1.calcolaArea();

        System.out.println(c1);
        System.out.println(r1);
        System.out.println(q1);

    }

}
