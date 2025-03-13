package Esercizio2;

import Esercizio1.Dipartimento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@AllArgsConstructor

public abstract class Dipendente {
    private String matricola;
    private double stipendio;
    @Setter
    private Dipartimento dipartimento;

    public abstract double calculateSalary();
}