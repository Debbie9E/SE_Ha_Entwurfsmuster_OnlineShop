
public class Artikel {
	private String artikelBezeichnung;
	private float einzelPreis;
	
	public Artikel(/*String bezeichnung, float preis*/){
//		this.artikelBezeichnung = bezeichnung;
//		this.einzelPreis = preis;		
	}
	
	public String getArtikelbeschreibung(){
		return this.artikelBezeichnung;
	}
	
	public float getEinzelPreis(){
		return this.einzelPreis;
	}
	
	public void setArtikelBezeichnung(String artikelBezeichnung){
		this.artikelBezeichnung = artikelBezeichnung;
	}
	
	public void setEinzelPreis(float einzelPreis){
		this.einzelPreis = einzelPreis;
	}
}
