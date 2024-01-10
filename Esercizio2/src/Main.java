import it.epicode.be.Chiamata;
import it.epicode.be.Sim;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio2");

        Sim sim= new Sim(345454676,0,new Chiamata[5]);
        Chiamata chiamata1= new Chiamata(10.5,987);
        sim.aggiungiChiamate(chiamata1);
        sim.stampaDatiSim();


    }



}