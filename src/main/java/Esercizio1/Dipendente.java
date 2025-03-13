package Esercizio1;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@AllArgsConstructor
public class Dipendente {
    private String matricola;
    private double stipendio;
    @Setter
    private Dipartimento dipartimento;
}
