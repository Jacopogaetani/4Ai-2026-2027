public class Main {
    public static void main(String[] args)
    {
        Quadrilatero q1 = new Quadrilatero("Rettangolo", 10, 3);
        q1.calcolaArea();
        System.out.println(q1);

        Coniche c1 = new Coniche("Cerchio", 10, 5, 5);
        c1.calcolaArea();
        System.out.println(c1);
    }

}
