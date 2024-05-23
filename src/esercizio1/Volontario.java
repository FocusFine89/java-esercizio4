package esercizio1;


import interfaces.Servizio;

public class Volontario implements Servizio {
    //Attributi
    private String nome;
    private int eta;
    private int cv;

    //Costruttore
    public Volontario(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }


    //Metodi

    @Override
    public void checkIn() {
        System.out.println("Check in Fatto " + this.nome);
    }


    //Altro
}
