package esercizio1;

import java.util.Objects;
import java.util.Random;

public abstract class Dipendente {
    //Attributi
    protected int matricola;
    protected int stipendio;
    protected String dipartimento;

    //Costruttori
    public Dipendente(int stipendio, String dipartimento) {
        Random matricola = new Random();
        this.matricola = matricola.nextInt(1, 10000);
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;

    }

    //Metodi
    

    //Altro

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public String getDipartimento() {
        return dipartimento;
    }

    public void setDipartimento(String dipartimento) {
        if (Objects.equals(dipartimento, "PRODUZIONE") || Objects.equals(dipartimento, "AMMINISTRAZIONE") || Objects.equals(dipartimento, "VENDITE")) {
            this.dipartimento = dipartimento;
        }

    }
}
