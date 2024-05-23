package esercizio1;

import interfaces.Servizio;

public class DipendenteFullTime extends Dipendente implements Servizio {
    //Attributi
    private int stipendioMensile;

    //Costruttori
    public DipendenteFullTime(int stipendio, String dipartimento) {
        super(stipendio, dipartimento);
    }

    //Metodi

    @Override
    public void checkIn() {
        System.out.println("Check in fatto " + this.dipartimento);
    }
}
