import org.w3c.dom.ls.LSOutput;

public class Main{

    public static void main(String[] args)
    {
        Libro l1 = new Libro(2016, "La storia dei ladri fantasma", 3, 100, true);
        Rivista r1 = new Rivista(2009, "A qualcuno interessa dei vip? La risposta è purtroppo sì", 2, "Scoop", 40);
        Libro l2 = new Libro(2026, "Dietro la maschera", 5, 500, false);
        Rivista r2 = new Rivista(2026, "Wow, 16 anni dopo a qualcuno interessa ancora dei vip? ", 4, "giallo", 90);
        Ebook e1 = new Ebook(2026, "10 motivi per non comprare degli ebook", 3, 100, 25, false);

        Pubblicazione[] lista = new Pubblicazione[5];
        lista[0] = l1;
        lista[1] = l2;
        lista[2] = r1;
        lista[3] = r2;
        lista[4] = e1;

        System.out.println("---------INFORMAZIONI SUI LIBRI---------");
        for(Pubblicazione p: lista)
        {
            System.out.println(p.toString());
            System.out.println("-------------------");
        }


        System.out.println("---------INFORMAZIONI SUL COSTO DEI PRESTITI LIBRI---------");
        for(Pubblicazione p: lista)
        {
            System.out.println(p.calcolaCostoPrestito());
            System.out.println("-------------------");
        }

        System.out.println("---------APPLICAZIONI SCONTI LIBRI---------");
        for(Pubblicazione p: lista)
        {
            if(p instanceof Libro)
            {
                System.out.println(p.getTitolo() + " è un libro e verrà scontato, nuovo prezzo: ");
                System.out.println(((Libro) p).calcolaPrezzoScontato());
            }

            if(p instanceof Rivista)
            {
                if(p.isRecente())
                {
                    System.out.println(p.getTitolo() + " è una rivista recente");
                }
            }

            if(p instanceof Ebook)
            {
                ((Ebook) p).leggiPagine(20);
                System.out.println(((Ebook) p).getPagineLette());
                System.out.println(((Ebook) p).getPercentualeLetta());
            }
        }

        System.out.println("---------PREONOTAZIONI---------");

        /*for (int i = 0; i <= lista.lenght(); i++)
            {
                meglio fare cosi
                if(lista[i] instance of Libro)
                {    
                    Libro l = (Libro) lista[i];
                    l.prenota();
                }
            }*/
        for(Pubblicazione p: lista)
        {
            if (p instanceof Libro || p instanceof Ebook)
            {
                
                if(((Prenotabile) p).prenota())
                {
                    System.out.println(p.getTitolo() + " è prenotabile");
                }
                else{
                    System.out.println(p.getTitolo() + " non è prenotabile");
                }
            }
        }
    }
}
