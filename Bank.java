import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Konto>listeKonten;

    public Bank (){
        listeKonten=ArrayList()
    }

    public void hinzufuegen (Konto konto){
        listeKonten.add(konto);
    }
}
