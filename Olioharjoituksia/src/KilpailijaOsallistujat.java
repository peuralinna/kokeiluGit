import java.util.*;


public class KilpailijaOsallistujat {
	private String KilpailunNimi;
	private List<Kilpailija> kisaajat=new ArrayList<Kilpailija>();
	
	public KilpailijaOsallistujat(String nimi){
		this.KilpailunNimi=nimi;
	}

	public String getKilpailunNimi() {
		return KilpailunNimi;
	}
	
	public void lisaaKilpailija(Kilpailija uusi){
		kisaajat.add(uusi);
	}

	@Override
	public String toString() {
		String teksti= KilpailunNimi+" osallistujat ovat:\n";
		for(Kilpailija alkio:kisaajat){
			teksti+=alkio+"\n";
		}
		return teksti;
	}
	
	
}
