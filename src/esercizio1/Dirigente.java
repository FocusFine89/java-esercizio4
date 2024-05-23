package esercizio1;

import interfaces.Servizio;

public class Dirigente extends Dipendente implements Servizio {
    public Dirigente(int stipendio, String dipartimento) {
        super(stipendio, dipartimento);
    }

    //Metodi

    @Override
    public void checkIn() {
        System.out.println("check in fatto " + this.dipartimento);
    }
}
