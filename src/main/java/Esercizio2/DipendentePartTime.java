package Esercizio2;

import Esercizio1.Dipartimento;

public class DipendentePartTime extends Dipendente{
    private double pagaOraria=20;
    private double oreLavorate=30;

    @Override
    public double calculateSalary() {
        return pagaOraria*oreLavorate;
    }
}
