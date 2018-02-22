import java.util.ArrayList;

public class Rubrica {
    private ArrayList<Voce> vet;
    
    
    public Rubrica() {
    	vet=new ArrayList <Voce>();
    }
    
    public void inserisci (Voce el) {
    	vet.add(el);
    }
    
    public boolean togli(String nome) {
    	int i;
		for(i=0;i<vet.size();i++)
    	if(vet.get(i).getNome().compareToIgnoreCase(nome)==0)
    		break;
		if(i<vet.size()) { //Controllo se esiste l'elemento i
			vet.remove(i);
			return true;
		}
		    return false;
    }
    
    public void modificaNumero(String num, String nome) {
    	int i;
    	for(i=0;i<vet.size();i++)
    		if(vet.get(i).getNome().compareToIgnoreCase(nome)==0) {
    			vet.set(i, new Voce (nome,num));
    			break;
    		}
    }
}
