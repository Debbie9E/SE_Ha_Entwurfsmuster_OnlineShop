import java.util.ArrayList;


public class Rechnung {
	
	private DruckStrategie druckStrategie;
	public ArrayList<Artikel> rechnungsliste = new ArrayList<Artikel>();
	
	public void setDruckStrategie(DruckStrategie strategie){
		this.druckStrategie = strategie;
	}
	
	public void add(String bezeichnung, float preis){
		Artikel artikel = new Artikel();
		rechnungsliste.add(artikel);
		artikel.setArtikelBezeichnung(bezeichnung);
		artikel.setEinzelPreis(preis);

	}
	
	public void drucken(){
		druckStrategie.listeAusgeben(rechnungsliste);
	}
	
	
}
