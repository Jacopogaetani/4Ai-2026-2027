public class Main
{
    public static void main(String[] args)
    {
        Programmatore p1 = new Programmatore("Jacopo",1600);
        Manager m1 = new Manager("Mario", 2000);

        System.out.println(p1.toString());
        System.out.println(m1.toString());

        System.out.println(p1.calcolaStipendio());
        System.out.println(m1.calcolaStipendio());
        System.out.println(m1.calcolaPremio());

    }

}
