import java.util.ArrayList;


public class HTML implements DruckStrategie{
	
	public void listeAusgeben(ArrayList<Artikel> liste) {
		System.out.println("<table>");
		System.out.println("  <tr>");
		for(int i = 0; i<liste.size(); i++){
			System.out.println("    <td>" + liste.get(i).getArtikelbeschreibung() + "</td>");
			System.out.println("    <td>" + liste.get(i).getEinzelPreis() + "</td></tr>");
			System.out.println("  <tr>");
		}
		System.out.println("<table>");
	}
}
