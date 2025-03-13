package Esercizio2;


import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class DipendenteFullTime extends Dipendente{
    private double pagaOraria=20;
    private double oreLavorate= 40;

    @Override
    public double calculateSalary() {
        return pagaOraria*oreLavorate;
    }




}
