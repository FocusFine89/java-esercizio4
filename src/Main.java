import esercizio1.*;

public class Main {
    public static void main(String[] args) {
        /*Dipendente thomasTurbato = new Dipendente(1300, "PRODUZIONE");
        Dipendente BioOrco = new Dipendente(2500, "AMMINISTRAZIONE");
        Dipendente KekkaPokkia = new Dipendente(1700, "VENDITE");

        Dipendente[] dipendenti = {thomasTurbato, BioOrco, KekkaPokkia};
        for (int i = 0; i < dipendenti.length; i++) {
            System.out.println(dipendenti[i].getMatricola());*/

        DipendenteFullTime thomasTurbato = new DipendenteFullTime(1500, "PRODUZIONE");
        DipendentePartTime bioOrco = new DipendentePartTime(30, "VENDITE");
        Dirigente kekkaPokkia = new Dirigente(2500, "AMMINISTRAZIONE");
        Volontario volontario1 = new Volontario("volontario1", 10);

        Dipendente[] dipendenti = {thomasTurbato, bioOrco, kekkaPokkia};
        int somma = 0;
        for (int i = 0; i < dipendenti.length; i++) {
            somma += dipendenti[i].getStipendio();
            System.out.println("Matricola n." + dipendenti[i].getMatricola());

        }
        System.out.println("il totale degli stipendi è: " + somma + " euro");
        thomasTurbato.checkIn();
        bioOrco.checkIn();
        kekkaPokkia.checkIn();
        volontario1.checkIn();

    }
}