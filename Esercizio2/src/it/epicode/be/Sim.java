package it.epicode.be;

public class Sim {
    private int numeroDiTelefono;
    private double credito;
    private Chiamata[] chiamate;
    public Sim (int numeroDiTelefono, double credito, Chiamata[] chiamate){
        this.numeroDiTelefono = numeroDiTelefono;
        this.credito = credito;
        this.chiamate = chiamate;
    }

    public void aggiungiChiamate(Chiamata nuovaChiamata){
        if (chiamate != null && chiamate.length > 0) {
            for (int i = 0; i < chiamate.length; i++) {
                if (chiamate[i] == null) {
                    chiamate[i] = nuovaChiamata;
                    break;
                }
            }
        }
    }
    public void stampaDatiSim() {
        System.out.println("Numero di telefono: " + numeroDiTelefono);
        System.out.println("Credito disponibile: " + credito);
        System.out.println("Elenco chiamate:");
        for (Chiamata chiamata : chiamate) {
            if (chiamata != null) {
                System.out.println("- Durata: " + chiamata.getMinuti() + " minuti, numero chiamato: " + chiamata.getNumeroChiamato());
            }
        }
    }

}
