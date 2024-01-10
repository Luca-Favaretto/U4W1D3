package it.epicode;

public class Articolo {
    private int codiceArticolo;
    private String descrizioneArticolo;
    private double prezzo;
    private int pezziMagazzino;

    public Articolo(int codiceArticolo,String descrizioneArticolo, double prezzo,int pezziMagazzino){
        this.codiceArticolo=codiceArticolo;
        this.descrizioneArticolo=descrizioneArticolo;
        this.prezzo=prezzo;
        this.pezziMagazzino=pezziMagazzino;
    }

}
