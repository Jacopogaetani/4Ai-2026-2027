package Ferrovia;

public class Addetto extends Persona implements Personale{
    private String matricola;
    private float pagaOraria;
    private int oreLavorate;

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public float getPagaOraria() {
        return pagaOraria;
    }

    public void setPagaOraria(float pagaOraria) {
        this.pagaOraria = pagaOraria;
    }

    public int getOreLavorate() {
        return oreLavorate;
    }

    @Override
    public String toString() {
        return "matricola='" + matricola + '\'' +
                ", pagaOraria=" + pagaOraria +
                ", oreLavorate=" + oreLavorate;
    }

    public Addetto(String nome, String cognome, String codiceFiscale, String matricola, float pagaOraria, int oreLavorate) {
        super(nome, cognome, codiceFiscale);
        this.matricola = matricola;
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public int registraOreLavoro(int ore) {
        do{
            if(ore > 0)
            {
                oreLavorate+=ore;
            }
            else{
                System.out.println("Numero negativo");
            }
        }while(ore > 0);

        return oreLavorate;
    }

    @Override
    public double calcolaStipendio() {
        double paga;
        if(oreLavorate <= 160)
        {
            paga = pagaOraria * oreLavorate;
        }
        else{
            paga = (160 * pagaOraria) + ((oreLavorate - 160) * 0.25);
        }

        return paga;
    }

    @Override
    public int calcolaPriorita() {
        if(oreLavorate > 8)
        {
            return 3;
        }
        else if(oreLavorate >= 4 && oreLavorate < 8)
        {
            return 2;
        }
        else{
            return 1;
        }
    }
}
