package com.negozio;

public class Negozio {
    private Prodotto[] scaffale = new Prodotto[50];
    private int dimensione = 0; // Conta quanti prodotti abbiamo inserito

    public void aggiungiProdotto(Prodotto p) {
        if (dimensione < 50) {
            scaffale[dimensione] = p;
            dimensione++;
        } else {
            System.out.println("Errore: lo scaffale è pieno!");
        }
    }

    public double valoreInventario() {
        double totale = 0;
        for (int i = 0; i < dimensione; i++) {
            totale += scaffale[i].calcolaValoreTotale();
        }
        return totale;
    }

    public void mostraProdotti() {
        if (dimensione == 0) System.out.println("Il negozio è vuoto.");
        for (int i = 0; i < dimensione; i++) {
            System.out.println(scaffale[i].toString());
        }
    }
}