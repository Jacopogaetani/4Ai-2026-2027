public abstract class Dipendente {
    private String nome, matricola;

    public Dipendente(String nome, String matricola) {
        this.nome = nome;
        this.matricola = matricola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public abstract double calcolaStipendio();

    @Override
    public String toString() {
        return  "nome='" + nome + '\'' +
                ", matricola='" + matricola + '\'';
    }
}
