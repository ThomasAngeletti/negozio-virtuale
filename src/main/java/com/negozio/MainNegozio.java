package com.negozio;
import java.util.Scanner;
import java.time.LocalDate;

public class MainNegozio {
    public static void main(String[] args) {
        Negozio mioNegozio = new Negozio();
        Scanner sc = new Scanner(System.in);
        int scelta;

        do {
            System.out.println("\n--- GESTIONE NEGOZIO ---");
            System.out.println("1. Inserisci Prodotto");
            System.out.println("2. Visualizza Prodotti");
            System.out.println("3. Calcola Valore Totale");
            System.out.println("4. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = sc.nextInt();
            sc.nextLine(); // Pulisce il tasto Invio

            if (scelta == 1) {
                System.out.print("Nome: "); String n = sc.nextLine();
                System.out.print("Prezzo: "); double p = sc.nextDouble();
                System.out.print("Quantità: "); int q = sc.nextInt();
                System.out.print("È alimentare? (1=Sì, 2=No): "); int tipo = sc.nextInt();
                
                if (tipo == 1) {
                    System.out.print("Anno scadenza (es. 2026): "); int anno = sc.nextInt();
                    System.out.print("Mese (1-12): "); int mese = sc.nextInt();
                    System.out.print("Giorno: "); int giorno = sc.nextInt();
                    LocalDate data = LocalDate.of(anno, mese, giorno);
                    mioNegozio.aggiungiProdotto(new ProdottoAlimentare(n, p, q, data));
                } else {
                    mioNegozio.aggiungiProdotto(new Prodotto(n, p, q));
                }
            } else if (scelta == 2) {
                mioNegozio.mostraProdotti();
            } else if (scelta == 3) {
                System.out.println("Valore totale inventario: " + mioNegozio.valoreInventario() + "€");
            }
        } while (scelta != 4);
        
        System.out.println("Programma terminato.");
        sc.close();
    }
}