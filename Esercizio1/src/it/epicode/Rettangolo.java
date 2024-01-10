package it.epicode;

public class Rettangolo {
    private int altezza;
    private int larghezza;

    public Rettangolo(int altezza, int larghezza) {
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public int calcolaPerimetro() {
        return (this.altezza + this.larghezza) * 2;
    }

    public int calcolaArea() {
        return this.altezza * this.larghezza;
    }

}
