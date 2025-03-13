package Esercizio2;


import Esercizio1.Dipartimento;
import Esercizio3.Lavoratori;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class DipendenteFullTime extends Dipendente implements Lavoratori {
    private double pagaOraria=20;
    private double oreLavorate= 40;

    public DipendenteFullTime(String matricola, double stipendio, Dipartimento dipartimento, double pagaOraria, double oreLavorate) {
        super(matricola, stipendio, dipartimento);
        this.pagaOraria = pagaOraria;
        this.oreLavorate = oreLavorate;
    }

    @Override
    public double calculateSalary() {
        return pagaOraria*oreLavorate;
    }


    @Override
    public void checkIn() {
        System.out.println("Check in Dipendente Full Time " + this.getMatricola());
    }
}
