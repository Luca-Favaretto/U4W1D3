package it.epicode.be;

public class Chiamata {
   private double minuti;
   private int numereChiamato;

   public Chiamata(double minuti, int numereChiamato){
      this.minuti= minuti;
      this.numereChiamato=numereChiamato;

   }
   public double getMinuti(){
      return minuti;
   }
   public int getNumeroChiamato(){
      return numereChiamato;
   }

}
