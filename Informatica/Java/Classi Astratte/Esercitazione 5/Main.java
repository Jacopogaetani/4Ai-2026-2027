public class Main {
    public static void main(String[] Args)
    {
        Dipendente[] lista = new Dipendente[4]; //Creazione array di oggetti
        //Istanziamento dei diversi oggetti di classi differenti
        lista[0] = new DipendenteFisso("Marco", "1", 1400);
        lista[1] = new Consulente("Mario", "2", 120, 6);
        lista[2] = new Consulente("Luigi", "3", 120, 9);
        lista[3] = new Manager("Giovanni", "4", 2000, 90);

        for(Dipendente d: lista)
        {
            System.out.println(d.toString());
            System.out.println(d.calcolaStipendio());

            if(d instanceof Consulente)
            {
                Consulente c = (Consulente) d;
                System.out.println(c.getOreLavorate());
                System.out.println(c.calcolaPremio());
            }else if(d instanceof Manager)
            {
                System.out.println("Manager: " + d.getNome());
                Manager m = (Manager) d;
                System.out.println(m.getBonus());
            }
        }
    }
}