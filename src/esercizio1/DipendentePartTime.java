package esercizio1;

import interfaces.Servizio;

public class DipendentePartTime extends Dipendente implements Servizio {
    //Attributi
    private int stipendio;
    private int oreLavorate;

    public DipendentePartTime(int stipendio, String dipartimento) {
        super(stipendio, dipartimento);
    }

    //Metodi


    @Override
    public void checkIn() {
        System.out.println("Check in fatto " + this.dipartimento);
    }
}
