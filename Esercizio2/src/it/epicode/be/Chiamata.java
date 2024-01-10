package it.epicode.be;

public class Chiamata {
    private double durata;
    private int numereChiamato;

    public Chiamata(double durata, int numereChiamato) {
        this.durata = durata;
        this.numereChiamato = numereChiamato;
    }

    public double getMinuti() {
        return durata;
    }

    public int getNumeroChiamato() {
        return numereChiamato;
    }

}
