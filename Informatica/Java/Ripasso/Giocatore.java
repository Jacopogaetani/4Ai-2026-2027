package Ripasso;

public class Giocatore {
    private String nome, cognome, ruolo, nazionalita;
    private int numeroMaglia;

    public Giocatore(String nome, String cognome, String ruolo, int numeroMaglia, String nazionalita) {
        this.nome = nome;
        this.cognome = cognome;
        this.ruolo = ruolo;
        this.numeroMaglia = numeroMaglia;
        this.nazionalita = nazionalita;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNome() {
        return nome;
    }

    public String getRuolo() {
        return ruolo;
    }

    public String getNazionalita() {
        return nazionalita;
    }

    public int getNumeroMaglia() {
        return numeroMaglia;
    }

    public void setNumeroMaglia(int numeroMaglia) { //Cambia numero ai giocatori
        this.numeroMaglia = numeroMaglia;
    }
}
