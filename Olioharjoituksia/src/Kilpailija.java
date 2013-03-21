import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Kilpailija implements Comparable<Kilpailija>{
	private String etunimi;
	private String sukunimi;
	private int sijoitus;
	
	private static final Comparator<Kilpailija> VOITTAJA_ENSIN = new Comparator<Kilpailija>(){
		public int compare(Kilpailija A, Kilpailija B){
			int eka = A.sijoitus;
			int toka = B.sijoitus;
			if(eka<toka){
				return -1;
			}else if(toka <eka){
				return 1;
			}else{
				return 0;
			}
		}
	};
	
	private static final Comparator<Kilpailija> VOITTAJA_VIKAKSI = Collections.reverseOrder(VOITTAJA_ENSIN);
	
	public Kilpailija(String etunimi, String sukunimi){
		this.etunimi=etunimi;
		this.sukunimi=sukunimi;
		this.sijoitus=0;
	}

	public void setSijoitus(int sijoitus) {
		this.sijoitus = sijoitus;
	}

	public String getEtunimi() {
		return etunimi;
	}

	public String getSukunimi() {
		return sukunimi;
	}

	public int getSijoitus() {
		return sijoitus;
	}

	public boolean equals(Object olio){
		if(this==olio){
			return true;
		}
		
		if(!(olio instanceof Kilpailija)){
			return false;
		}
		final Kilpailija apu=(Kilpailija)olio;
		if(this.etunimi!=apu.etunimi && (this.etunimi==null || !this.etunimi.equals(apu.etunimi))){
			return false;
		}
		
		if(this.sukunimi!=apu.sukunimi && (this.sukunimi==null || !this.sukunimi.equals(apu.sukunimi))){
			return false;
		}
		 if(this.sijoitus!=apu.sijoitus){
			 return false;
		 }
		 return true;
	}
	
	public int hashCode(){
		int hajautusavain = 5;
		hajautusavain = 29*hajautusavain+(this.etunimi!=null?this.etunimi.hashCode():0);
		hajautusavain = 29*hajautusavain+(this.sukunimi!=null?this.sukunimi.hashCode():0);
		hajautusavain = 29 *hajautusavain+this.sijoitus;
		return hajautusavain;
	}
	
	
	@Override
	public String toString() {
		return "Kilpailija [etunimi=" + etunimi + ", sukunimi=" + sukunimi
				+ ", sijoitus=" + sijoitus + "]";
	}
	
	@Override
	public int compareTo(Kilpailija olio) {
		
		Collator apu = Collator.getInstance();
		apu.setStrength(Collator.PRIMARY);
		int tulos = apu.compare(this.sukunimi, olio.sukunimi);
		if(tulos != 0){
			return tulos;
		}else{
			return apu.compare(this.etunimi, olio.etunimi);
		}
		
	}
	

	
	public static String listaMerkkijonoksi(List<Kilpailija> lista){
		String vastaus="";
		for(Kilpailija olio:lista){
			vastaus+=olio+"\n";
		}
		return vastaus;
	}
	
	//Testaus
	public static void main(String args[]){
		Kilpailija yksi = new Kilpailija("Jaana","Hirvonen");
		yksi.setSijoitus(1);
		
		Kilpailija kaksi = new Kilpailija("Erkki","Pohjonen");
		kaksi.setSijoitus(2);
		
		Kilpailija kolme = yksi;
		
		Kilpailija nelja = new Kilpailija("Erkki","Pohjonen");
		nelja.setSijoitus(2);
		
		if(kaksi == nelja){
			System.out.println("Kilpailijat(2 ja 4) ovat samat");
		}else{
			System.out.println("Kilpailijat(2 ja 4) eivät ole samat");
		}
		
		if(kaksi.equals(nelja)){
			System.out.println("Kilpailijat(2 ja 4) ovat samat");
		}else{
			System.out.println("Kilpailijat(2 ja 4) eivät ole samat");
		}
		
		if(yksi == kolme){
			System.out.println("Kilpailijat(1 ja 3) ovat samat");
		}else{
			System.out.println("Kilpailijat(1 ja 3) eivät ole samat");
		}
		
		if(yksi.equals(kolme)){
			System.out.println("Kilpailijat(1 ja 3) ovat samat");
		}else{
			System.out.println("Kilpailijat(1 ja 3) eivät ole samat");
		}
		
		if(yksi.equals(kaksi)){
			System.out.println("yksi ja kaksi on samat");
		}else{
			System.out.println("yksi ja kaksi eivät ole samat");
		}
		//Testataan lajittelua:
		List<Kilpailija> lista = new ArrayList<Kilpailija>();
		lista.add(yksi);
		lista.add(kaksi);
		lista.add(nelja);
		lista.add(new Kilpailija("Kalle","Savolainen"));
		lista.add(new Kilpailija("Sini","Savolainen"));
		lista.add(new Kilpailija("Aleksi","Aalto"));
		lista.add(new Kilpailija("Aleksi","Heinonen"));
		
		System.out.println("Lista ennen järjestämistä:\n"+Kilpailija.listaMerkkijonoksi(lista));
		Collections.sort(lista);
		System.out.println("Lista järjestämisen jälkeen:\n"+Kilpailija.listaMerkkijonoksi(lista));
		Collections.sort(lista, Kilpailija.VOITTAJA_ENSIN);
		System.out.println("Lista jossa voittaja ensin:\n"+Kilpailija.listaMerkkijonoksi(lista));
		Collections.sort(lista, Kilpailija.VOITTAJA_VIKAKSI);
		System.out.println("Lista jossa voittaja ensin:\n"+Kilpailija.listaMerkkijonoksi(lista));
	}


}
