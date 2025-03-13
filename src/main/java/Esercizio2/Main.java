package Esercizio2;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente= new Dirigente();
        Dipendente dipendente1= new DipendentePartTime();
        Dipendente dipendente2= new DipendenteFullTime();
        Dipendente dipendente3= new Dirigente();
        Dipendente[] dipendenti={dipendente,dipendente1,dipendente2,dipendente3};

        double totale= 0;

        System.out.println("Esercizio 2");

        for (int i=0;i<dipendenti.length;i++){
            if (dipendenti[i] != null) {
                totale += dipendenti[i].calculateSalary();
            }

        }
        System.out.println("Il totale dei salari è : " + totale);
    }
}
