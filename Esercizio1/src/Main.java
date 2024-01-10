import it.epicode.Rettangolo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Esercizio 1");
        Rettangolo rettangolo = new Rettangolo(4,5);
        Rettangolo rettangolo1 = new Rettangolo(6,35);


        stampaRettangolo(rettangolo);
        stampaDueRettangolo(rettangolo,rettangolo1);



    }


    private static void stampaRettangolo(Rettangolo esempio){
        System.out.println("L'area del rettangolo è "+ esempio.calcolaArea()+". Il perimetrodel rettangolo è "+esempio.calcolaPerimetro());

    }
    private static void stampaDueRettangolo(Rettangolo esempio,Rettangolo esempio1){

        System.out.println("L'area dei rettangolo è "+ (esempio.calcolaArea()+esempio1.calcolaArea())+". Il perimetro dei rettangolo è "+(esempio.calcolaPerimetro()+esempio1.calcolaPerimetro()));

    }
}