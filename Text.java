import java.util.ArrayList;


public class Text implements DruckStrategie{
	
	public void listeAusgeben(ArrayList<Artikel> liste){
		for (int i = 0; i<liste.size(); i++){
			System.out.println(liste.get(i).getArtikelbeschreibung() + ": " + liste.get(i).getEinzelPreis());
		}
	}
}
