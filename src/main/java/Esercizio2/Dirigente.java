package Esercizio2;

import Esercizio1.Dipartimento;
import Esercizio3.Lavoratori;



public class Dirigente extends Dipendente implements Lavoratori {

    public Dirigente(String matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public double calculateSalary() {
        double salario=4000;
        return salario;
    }


    @Override
    public void checkIn() {
        System.out.println("Check in Dirigente " + this.getMatricola() );
    }
}
