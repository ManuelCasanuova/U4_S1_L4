package Esercizio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Volontario implements Lavoratori {
    private String nome;
    private int eta;
    private String CV;

    @Override
    public void checkIn() {
        System.out.println("Check in Volontario " + this.nome);
    }
}
