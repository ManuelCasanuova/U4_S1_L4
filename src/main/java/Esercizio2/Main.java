package Esercizio2;

import Esercizio1.Dipartimento;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente= new Dirigente("123", 4000, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente1= new DipendentePartTime("456", 2000, Dipartimento.VENDITE, 20, 30);
        Dipendente dipendente2= new DipendenteFullTime("897", 1000, Dipartimento.PRODUZIONE, 20, 40);
        Dipendente dipendente3= new Dirigente("679", 4000, Dipartimento.AMMINISTRAZIONE);
        Dipendente[] dipendenti={dipendente,dipendente1,dipendente2,dipendente3};

        double totale= 0;

        System.out.println("Esercizio 2");

        for (int i=0;i<dipendenti.length;i++){
            if (dipendenti[i] != null) {
                totale += dipendenti[i].calculateSalary();
                System.out.println("Lo stipendio del dipendente " + dipendenti[i].calculateSalary());
            }

        }
        System.out.println("Il totale dei salari è : " + totale);
    }
}
