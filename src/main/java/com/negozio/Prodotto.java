package com.negozio;

public class Prodotto {
    private String nome;
    private double prezzo;
    private int quantita;

    // Costruttore: assegna i valori iniziali
    public Prodotto(String nome, double prezzo, int quantita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.quantita = quantita;
    }

    // Getter: per leggere i dati
    public String getNome() { return nome; }
    public double getPrezzo() { return prezzo; }
    public int getQuantita() { return quantita; }

    // Metodo richiesto: Prezzo x Quantità
    public double calcolaValoreTotale() {
        return prezzo * quantita;
    }

    @Override
    public String toString() {
        return "Prodotto: " + nome + " | Prezzo: " + prezzo + "€ | Qta: " + quantita;
    }
}