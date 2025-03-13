package Esercizio3;

import Esercizio1.Dipartimento;
import Esercizio2.DipendenteFullTime;
import Esercizio2.DipendentePartTime;
import Esercizio2.Dirigente;

public class Main {
    public static void main(String[] args) {
      Lavoratori volontario= new Volontario("Giuseppe", 20, "CV");
      Lavoratori volontario1= new Volontario("Giovanni", 30, "CV");
      Lavoratori dipendente= new DipendenteFullTime("123", 1000, Dipartimento.PRODUZIONE, 20, 40);
      Lavoratori dipendente1= new Dirigente("234", 4000, Dipartimento.AMMINISTRAZIONE);
      Lavoratori dipendente2= new DipendentePartTime( "435", 2000, Dipartimento.VENDITE, 20, 30);


        Lavoratori [] lavoratori= {volontario,volontario1,dipendente,dipendente1,dipendente2};

        for (int i=0;i<lavoratori.length;i++){
            lavoratori[i].checkIn();
        }
    }
    }




