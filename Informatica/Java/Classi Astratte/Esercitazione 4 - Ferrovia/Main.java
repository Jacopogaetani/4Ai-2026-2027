package Ferrovia;

public class Main {
    public static void main(String[] args)
    {
        Passeggero p1 = new Passeggero("Jacopo", "Gaetani", "Codice 1", 789, "Osteria Nuova", false);
        Passeggero p2 = new Passeggero("Mario", "Rossi", "Codice 2", 899, "Milano", true);

        Addetto a1 = new Addetto("Giuseppe", "Bianchi", "Codice 3", "mat1", 30, 150);
        Addetto a2 = new Addetto("Carlo", "Esposito", "Codice 4", "mat2", 40, 180);

        Controllore c1 = new Controllore("Antonio", "Cavallari", "Codice 5", "mat3", 50, 140, "Osteria nuova - Bologna", 3);
        Controllore c2 = new Controllore("Michele", "Antoniano", "Codice 6", "mat4", 60, 190, "Milano - Zurigo", 5);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(c1.toString());
        System.out.println(c2.toString());

        System.out.println("Priorità passeggeri");
        System.out.println(p1.calcolaPriorita());
        System.out.println(p2.calcolaPriorita());
        System.out.println("Priorità addetti");
        System.out.println(a1.calcolaPriorita());
        System.out.println(a2.calcolaPriorita());
        System.out.println("Priorità controllore");
        System.out.println(c1.calcolaPriorita());
        System.out.println(c2.calcolaPriorita());

        a1.registraOreLavoro(5);
        System.out.println(a1.calcolaStipendio());

        a2.registraOreLavoro(20);
        System.out.println(a2.calcolaStipendio());

        c1.registraOreLavoro(2);
        System.out.println(c1.calcolaStipendio());

        c2.registraOreLavoro(10);
        c1.calcolaStipendio();



    }
}
