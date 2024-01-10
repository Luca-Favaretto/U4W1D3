package it.epicode;

public class Cliente {
    private int codiceClienti;
    private String nomeCognome;
    private String email;
    private String data;

    public Cliente(int codiceClienti,String nomeCognome,String email, String data){
        this.codiceClienti=codiceClienti;
        this.nomeCognome=nomeCognome;
        this.email=email;
        this.data=data;
    }
}
