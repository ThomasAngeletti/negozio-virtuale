package com.negozio;
import java.time.LocalDate;

public class ProdottoAlimentare extends Prodotto {
    private LocalDate dataScadenza;

    public ProdottoAlimentare(String nome, double prezzo, int quantita, LocalDate dataScadenza) {
        // super richiama il costruttore di Prodotto
        super(nome, prezzo, quantita);
        this.dataScadenza = dataScadenza;
    }

    public boolean eScaduto() {
        // Confronta la data di oggi con la scadenza
        return LocalDate.now().isAfter(dataScadenza);
    }

    @Override
    public String toString() {
        String stato = eScaduto() ? " [ATTENZIONE: SCADUTO]" : " [OK]";
        return super.toString() + " | Scadenza: " + dataScadenza + stato;
    }
}